package hosptial;

import hosptial.domain.User;

public class LoginSession {

	private static User session;

	public static User getSession() {
		return session;
	}

	public static void setSession(User session) {
		LoginSession.session = session;
	}
	
}
