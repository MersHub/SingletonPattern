public class ProgramLoger {
   private static ProgramLoger programLoger;
   private static String logfile = "This is log file \n\n";

   public static ProgramLoger getProgramLoger(){
       if (programLoger == null) {
           programLoger = new ProgramLoger();
       }
       return programLoger;
   }

   private ProgramLoger(){}

    public void addLogInfo (String logInfo){
       logfile += logInfo + "\n";
    }

    public void showLogFile (){
        System.out.println(logfile);
    }
}
