import java.util.*;

class Appointment implements Comparable<Appointment> {
    String docName;
    int time;
    int min; // Initialize or set min explicitly

    String patName;

    public Appointment(String docName, int time, int min, String patName) {
        this.docName = docName;
        this.time = time;
        this.min = min; // Initialize min in the constructor
        this.patName = patName;
    }

    @Override
    public int compareTo(Appointment ap) {
        if (this.time != ap.time)
            return Integer.compare(this.time, ap.time);
        else
            return Integer.compare(this.min, ap.min);
    }

    @Override
    public String toString() {
        return docName + " at " + String.format("%02d", time) + ":" + String.format("%02d", min) + " for " + patName;
    }

    public String patNameToString() {
        return patName;
    }
}

public class ScheduleAppointment {
    public static void main(String[] args) {
        PriorityQueue<Appointment> apps = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);

        Map<String, Set<Integer>> scheduled = new HashMap<>();
        for (int i = 1; i <= 3; i++) {
            scheduled.put("Doctor" + i, new HashSet<>());
        }
        boolean exit = false;
        while (!exit) {
            boolean allDoctorsBusy = true;
            for (int i = 1; i <= 3; i++) {
                String docName = "Doctor" + i;
                int numApp = 6;
                for (int j = 0; j < numApp; j++) {
                    System.out.println("Do you want to schedule an appointment? (If yes, press 1// If no, press 0)");
                    int permit = sc.nextInt();
                    if (permit == 0) {
                        exit = true;
                        break;
                    }
                    System.out.println("Enter the time to schedule your appointment " + (j + 1) + " for " + docName + ":");
                    int time = sc.nextInt();
                    sc.nextLine();
                    if (time < 10 || time >= 17 || time == 13) {
                        System.out.println("Invalid time!...Choose a time between 10am to 5pm, except 1pm(Lunch Break)");
                        j--;
                        continue;
                    }
                    String currDoctor = docName;
                    int count = 0;
                    while (scheduled.get(currDoctor).contains(time)) {
                        int nextDoctor = (i % 3) + 1;
                        currDoctor = "Doctor" + nextDoctor;
                    }
                    System.out.println("Enter your name : ");
                    String name = sc.nextLine();
                    System.out.println(name + " is scheduled to see " + currDoctor + " at " + time + ":00 ");
                    scheduled.get(currDoctor).add(time);
                    apps.offer(new Appointment(currDoctor, time, 0, name)); // Set min to 0 for simplicity
                    allDoctorsBusy = false;
                }
                if (exit) {
System.out.println("Today's Appointments are : ");
        while (!apps.isEmpty()) {
            Appointment app = apps.poll();
            System.out.println(app);
        }
                    return;
                }
                if (allDoctorsBusy) {
                    System.out.println("All doctors are busy at this time. Please choose another time.");
                }
            }
        }
        
        sc.close();
         
    }
}
