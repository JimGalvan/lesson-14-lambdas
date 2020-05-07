package exercises;

import java.util.Collections;

public class _3_JobCandidateSelectorUsingLambdas {
	public static void main(String[] args) {

		// 1. Sort the candidates by salary requirements, low to high
		Collections.sort(JobCandidate.jobCandidates,
				(JobCandidate o1, JobCandidate o2) -> o1.getSalaryRequired() - o2.getSalaryRequired());
		
		System.out.println("By salary: " + JobCandidate.jobCandidates+ "\n");


		// 2. Filter out any candidates that have not been taught by me (June)
		// Hint: see the removeIf() method in the Collections class

		JobCandidate.jobCandidates
				.removeIf((JobCandidate person) -> person.getTeacherName().matches("^(?!.*(June)).*$"));
		
		System.out.println("June students: " + JobCandidate.jobCandidates);

	}

}