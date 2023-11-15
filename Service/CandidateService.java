package com.infy.service;

import com.infy.dao.CandidateDAO;
import com.infy.model.Candidate;
import com.infy.model.CandidateReport;

public class CandidateService {

	// can have result as 'P' only if all 3 marks are 50 and above
	public String addCandidate(Candidate candidate) {
		if( (candidate.getMark1() >= 50 && candidate.getMark2() >= 50 && candidate.getMark3() >= 50) && (candidate.getResult() == 'P') ) {
			CandidateDAO dataBase = new CandidateDAO();
			return dataBase.addCandidate(candidate);
		} else {
			return "Result should be 'F' (Fail) if student scores less than 50 in any one subject";
		}
	}

	// calculating grade for candidate based on his marks and result
	public String calculateGrade(CandidateReport candidateReportTO) {
		if( candidateReportTO.getResult() == 'F' ) {
			return "NA";
		} else {
			Integer average = ( candidateReportTO.getMark1() + candidateReportTO.getMark2() + candidateReportTO.getMark3() ) / 3;
			if( average >= 85 ) {
				return "A";
			} else if( average >= 75 && average < 85 ) {
				return "B";
			} else if( average >= 0 && average < 75 ){
				return "C";
			} else {
				return "Invalid Marks!!";
			}
		}
	}

	// populating String[] by calling calculateGrade(candidateReportTO) and returning the same.
	public String[] getGradesForAllCandidates() {
		CandidateDAO candidateDatabase = new CandidateDAO();
		CandidateReport[] candidatesData = candidateDatabase.getAllCandidates();
		String[] gradesForAllCandidates = new String[candidatesData.length];
		for( int i = 0; i < candidatesData.length; i++ ) {
			gradesForAllCandidates[i] = candidatesData[i].getCandidateId().toString() + ":" + this.calculateGrade(candidatesData[i]);
		}
		return gradesForAllCandidates;
	}
}
