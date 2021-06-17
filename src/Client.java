public class Client {
    public static void main(String[] args) {
        ProgramLoger.getProgramLoger().addLogInfo("First log...");
        ProgramLoger.getProgramLoger().addLogInfo("Second log...");
        ProgramLoger.getProgramLoger().addLogInfo("Third log...");

        ProgramLoger.getProgramLoger().showLogFile();

        System.out.println(ProgramLoger.getProgramLoger().toString());
        System.out.println(ProgramLoger.getProgramLoger().toString());
        System.out.println(ProgramLoger.getProgramLoger().toString());
        System.out.println(ProgramLoger.getProgramLoger().toString());
        System.out.println(ProgramLoger.getProgramLoger().toString());
        System.out.println(ProgramLoger.getProgramLoger().toString());
    }
}
