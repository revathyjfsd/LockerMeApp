package com.lockedMe.app.exception;

public class FileNotExistException extends Exception {
	
	@Override
	public String toString() {
		return "Current Directory does not have any files";

}
}
