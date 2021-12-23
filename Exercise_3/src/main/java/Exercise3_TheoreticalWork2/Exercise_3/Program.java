package Exercise3_TheoreticalWork2.Exercise_3;

import java.util.InputMismatchException;

public class Program {
	/*Attributes for the first table*/
	public int f_comp;
	public int f_corr;
	public int f_appr;

	/*Attributes for the second table*/
	public int modularity;
	public int reusability;
	public int analyzability;
	public int modificable;
	public int testable;

	public Program() {}

	/*Part one*/
	public void setComp(int c) {
		this.f_comp = c;
	}
	public void setCorr(int c) {
		this.f_corr = c;
	}
	public void setAppr(int c) {
		this.f_appr = c;
	}

	/*Part two*/
	public void setModularity(int c) {
		this.modularity = c;
	}
	public void setReusability(int c) {
		this.reusability = c;
	}
	public void setAnalyzability(int c) {
		this.analyzability = c;
	}
	public void setModifiability(int c) {
		this.modificable = c;
	}
	public void setTestability(int c) {
		this.testable = c;
	}

	/*METHOD DEVELOPED*/

	public boolean isCertificable() throws InvalidException {
		boolean certified = false;
		int quality = -1;
		int functionalSuitability, maintainability;
        int min_first, min_second;

		try {
            /*Functional completeness*/
            if (f_comp >= 0 && f_comp < 10) {
                this.f_comp = 0;
            }
            else if (f_comp >= 10 && f_comp < 35) {
                this.f_comp = 1;
            }
            else if (f_comp >= 35 && f_comp < 70) {
                this.f_comp = 2;
            }
            else if (f_comp >= 70 && f_comp < 90) {
                this.f_comp = 3;
            }
            else if (f_comp >= 90 && f_comp <= 100) {
                this.f_comp = 4;
            }
            else {
                this.f_comp = -1;
                throw new InvalidException();
            }

            /*Functional Correctness*/
            if(f_corr >= 0 && f_corr < 10) {
                this.f_corr = 0;
            }
            else if (f_corr >= 10 && f_corr < 50) {
                this.f_corr = 1;
            }
            else if (f_corr >= 50 && f_corr < 70) {
                this.f_corr = 2;
            }
            else if (f_corr >= 70 && f_corr < 90) {
                this.f_corr = 3;
            }
            else if (f_corr >= 90 && f_corr <= 100) {
                this.f_corr = 5;
            }
            else {
                this.f_corr = -1;
                throw new InvalidException();
            }

            /*Functional appropiateness*/
            if (f_appr >= 0 && f_appr < 10) {
                this.f_appr = 0;
            }
            else if (f_appr >= 10 && f_appr < 50) {
                this.f_appr = 2;
            }
            else if (f_appr >= 50 && f_appr < 70) {
                this.f_appr = 3;
            }
            else if (f_appr >= 70 && f_appr < 90) {
                this.f_appr = 4;
            }
            else if (f_appr >= 90 && f_appr <= 100) {
                this.f_appr = 5;
            }
            else {
                this.f_appr = -1;
                throw new InvalidException();
            }

            /*Calculate the Functional Suitability*/
            functionalSuitability = Math.min(this.f_comp, this.f_corr);
            functionalSuitability = Math.min(functionalSuitability, this.f_appr);

            /*Modularity*/
            if (modularity >= 0 && modularity < 10) {
                this.modularity = 0;
            }
            else if (modularity >= 10 && modularity < 35) {
                this.modularity = 1;
            }
            else if (modularity >= 35 && modularity < 70) {
                this.modularity = 2;
            }
            else if (modularity >= 70 && modularity < 90) {
                this.modularity = 3;
            }
            else if (modularity >= 90 && modularity <= 100) {
                this.modularity = 4;
            }
            else {
                this.modularity = -1;
                throw new InvalidException();
            }

            /*Reusability*/
            if (reusability >= 0 && reusability < 10) {
                this.reusability = 0;
            }
            else if (reusability >= 10 && reusability < 35) {
                this.reusability = 1;
            }
            else if (reusability >= 35 && reusability < 70) {
                this.reusability = 2;
            }
            else if (reusability >= 70 && reusability < 90) {
                this.reusability = 3;
            }
            else if (reusability >= 90 && reusability <= 100) {
                this.reusability = 5;
            }
            else {
                this.reusability = -1;
                throw new InvalidException();
            }

            /*Analyzability*/
            if (analyzability >= 0 && analyzability < 35) {
                this.analyzability = 0;
            }
            else if (analyzability >= 35 && analyzability < 50) {
                this.analyzability = 1;
            }
            else if (analyzability >= 50 && analyzability < 70) {
                this.analyzability = 2;
            }
            else if (analyzability >= 70 && analyzability < 90) {
                this.analyzability = 3;
            }
            else if (analyzability >= 90 && analyzability <= 100) {
                this.analyzability = 5;
            }
            else {
                this.analyzability = -1;
                throw new InvalidException();
            }

            /*Modifiability*/
            if (modificable >= 0 && modificable < 10) {
                this.modificable = 0;
            }
            else if (modificable >= 10 && modificable < 35) {
                this.modificable = 1;
            }
            else if (modificable >= 35 && modificable < 50) {
                this.modificable = 2;
            }
            else if (modificable >= 50 && modificable < 70) {
                this.modificable = 3;
            }
            else if (modificable >= 70 && modificable < 90) {
                this.modificable = 4;
            }
            else if (modificable >= 90 && modificable <= 100) {
                this.modificable = 5;
            }
            else {
                this.modificable = -1;
                throw new InvalidException();
            }

            /*Testability*/
            if (testable >= 0 && testable < 10) {
                this.testable = 0;
            }
            else if (testable >= 10 && testable < 50) {
                this.testable = 1;
            }
            else if (testable >= 50 && testable < 70) {
                this.testable = 2;
            }
            else if (testable >= 70 && testable <= 100) {
                this.testable = 4;
            }
            else {
                this.testable = -1;
                throw new InvalidException();
            }

            /*Calculate the Maintainability*/
            min_first = Math.min(this.modularity, this.reusability);
            min_second = Math.min(this.analyzability, this.modificable);
            maintainability = Math.min(min_first, min_second);
            maintainability = Math.min(maintainability, this.testable);

            /*Certifying a program, after computing both Functional Suitability and Maintainability values*/
            if(functionalSuitability == 3) {
                if(maintainability >= 3) {
                    quality = 3;
                    System.out.println("Program certified - Quality = " + quality);
                    certified = true;
                }

            }else if(functionalSuitability == 4) {
                if(maintainability > 0 && maintainability <= 3) {
                    quality = 3;
                    System.out.println("Program certified - Quality = " + quality);
                    certified = true;

                }else if (maintainability == 4) {
                    quality = 4;
                    System.out.println("Program certified - Quality = " + quality);

                    certified = true;
                }

            }else { //less than 3
                System.out.println("Program NOT certified");
            }

		}catch(InvalidException i) {
            System.out.println(i.getMessage());
            System.out.println("Program NOT certified");
            return certified;
        }
		
        return certified;
    }
}

