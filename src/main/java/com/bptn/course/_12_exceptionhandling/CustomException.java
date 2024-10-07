package com.bptn.course._12_exceptionhandling;

class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) {
		super(message);
	}
}

public class CustomException {

	private double accountBalance;

	// constructor
	public CustomException(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void withdraw(double amountToWithdraw) throws InsufficientBalanceException {
		if (accountBalance >= amountToWithdraw) {
			this.accountBalance -= amountToWithdraw;
			System.out.println("Withdrawal Successful!");
		} else {
			throw new InsufficientBalanceException("Insufficient funds!");
		}
	}

	public static void main(String[] args) {
		CustomException myDemo = new CustomException(1000.00);
		try {
			myDemo.withdraw(1500);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}

}
////custom exception 2.10 instructor
//	class FileExtensionException extends Exception {
//		public FileExtensionException(String message) {
//			super(message);
//		}
//
//		}
//
//		public static void main(String[] args) {
//			// Write your code below.
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("Enter the file name with correct extension i.e. .txt ");
//
//			String fileName = scanner.nextLine();
//			fileName.toLowerCase();
//			// fileName = fileName.toLowerCase();
//
//			try {
//				validateFileExtension(fileName);
//				System.out.println("Correct file name with extension .txt");
//			} catch (FileExtensionException e) {
//				System.out.println("Error: " + e.getMessage());
//			} finally {
//				scanner.close();
//			}
//
//		}
//
//	private static void validateFileExtension(String fileName) throws FileExtensionException{
//            if(!fileName.endsWith(".txt")){
//                throw new FileExtensionException("File doesn't have .txt extension");
//            }
//        }
