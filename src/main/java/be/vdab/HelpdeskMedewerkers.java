package be.vdab;

import java.util.Map;

public class HelpdeskMedewerkers {
	private final Map<String, Integer> medewerkers;

	HelpdeskMedewerkers(Map<String, Integer> medewerkers) {
		this.medewerkers = medewerkers;
	}

	@Override
	public String toString() {
		return medewerkers.toString();
	}

}
