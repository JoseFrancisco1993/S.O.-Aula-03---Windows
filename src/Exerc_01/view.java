package Exerc_01;

public class view {

	public static void main(String[] args) {
		
		RedesController redController = new RedesController();
//		String os = redController.os();
//		System.out.println(os);
//		
//		String process = "C:\\Windows\\write.exe";
//		redController.callProcess(process);
		
//		String process = "TASKLIST /FO TABLE";
//		redController.readProcess(process);
		
//		String process = "PING -4 -n 10 www.google.com.br";
//		redController.readProcess(process);
		
//		String process = "ipconfig";
//		redController.readProcess(process);
		
		String param = "cmd.exe";
		redController.killProcess(param);
		
		
		}
}
