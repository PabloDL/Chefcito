package com.DLDev.Chefcito.models;

import java.util.Objects;

public class ChangePasswordRequest {
	private String currentPassword;
	private String newPassword;
	private String confirmationPassword;

	public ChangePasswordRequest() {}

	public ChangePasswordRequest(String currentPassword, String newPassword, String confirmationPassword) {
		super();
		this.currentPassword = currentPassword;
		this.newPassword = newPassword;
		this.confirmationPassword = confirmationPassword;
	}

	public String getCurrentPassword() {
		return currentPassword;
	}

	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfirmationPassword() {
		return confirmationPassword;
	}

	public void setConfirmationPassword(String confirmationPassword) {
		this.confirmationPassword = confirmationPassword;
	}

	@Override
	public String toString() {
		return "ChangePasswordRequest [currentPassword=" + currentPassword + ", newPassword=" + newPassword
				+ ", confirmationPassword=" + confirmationPassword + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(confirmationPassword, currentPassword, newPassword);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChangePasswordRequest other = (ChangePasswordRequest) obj;
		return Objects.equals(confirmationPassword, other.confirmationPassword)
				&& Objects.equals(currentPassword, other.currentPassword)
				&& Objects.equals(newPassword, other.newPassword);
	}

	
}
