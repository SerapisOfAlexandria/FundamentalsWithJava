package Fundamentals.Lab18;

import java.util.*;
import java.util.stream.Collectors;

public class SoftUniExamResults {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Participants' scores
        LinkedHashMap<String, Integer> scores = new LinkedHashMap<>();

        //Participants in each language exam
        LinkedHashMap<String, Integer> signedParticipantsInExam = new LinkedHashMap<>();

        String[] command = filterCommand(input.nextLine());

        while (!command[0].equals("exam finished")) {

            if (command[1].equals("banned")) {
                scores.remove(command[0]);
                command = filterCommand(input.nextLine());
                continue;
            }

            // Keeps the highest score
            if (scores.containsKey(command[0])) {
                if (scores.get(command[0]) < Integer.parseInt(command[2])) {
                    scores.put(command[0], Integer.parseInt(command[2]));

                }
            } else {
                scores.put(command[0], Integer.parseInt(command[2]));
            }

            //Counts participants in each language exam
            if (signedParticipantsInExam.containsKey(command[1])) {
                signedParticipantsInExam.put(command[1], signedParticipantsInExam.get(command[1]) + 1);
            } else {
                signedParticipantsInExam.put(command[1], 1);
            }

            command = filterCommand(input.nextLine());
        }

        String results = "Results:\n" + scores.entrySet().stream()
                .map(entry -> entry.getKey() + " | " + entry.getValue())
                .collect(Collectors.joining("\n"));

        String countOfParticipantsInExams = "Submissions:\n" + signedParticipantsInExam.entrySet().stream()
                .map(entry -> entry.getKey() + " - " + entry.getValue())
                .collect(Collectors.joining("\n"));

        System.out.println(results);
        System.out.println(countOfParticipantsInExams);
    }

    public static String[] filterCommand(String command) {
        if (command.equals("exam finished")) {
            return new String[]{command};
        } else if (command.contains("banned")) {
            String[] ban = command.split("-");
            return ban;
        } else {
            String[] participantCourseScore = command.split("-");
            return  participantCourseScore;
        }
    }
}
