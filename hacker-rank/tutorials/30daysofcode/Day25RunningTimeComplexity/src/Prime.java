class Prime {
	
    private int primeCandidate;
    private int multipleCount;
    
    public Prime (int candidate) {
        primeCandidate = candidate;
        
        if (candidate == 0 || candidate == 1) {
            multipleCount = 1;
        } else { 
            multipleCount = 2;
        } 
    }
    
    public String isPrimeSquareRootBased() {
        boolean otherMultiplesFound = false;
 
        if (multipleCount > 1) {
            // Every composite number has a factor less than or equal to its square root : sqrt(n) times
            int squareRoot = (int)Math.floor(Math.sqrt(primeCandidate));
            
            // Check the basic prime multiples first : 4 times
            if ((primeCandidate != 2 && primeCandidate % 2 == 0) || 
                (primeCandidate != 3 && primeCandidate % 3 == 0) ||
                (primeCandidate != 5 && primeCandidate % 5 == 0) || 
                (primeCandidate != 7 && primeCandidate % 7 == 0)) {
                return "Not prime";
            }
            
            // Skip all even numbers : n/2 - 4 times
            for (int index = 9; index <= squareRoot; index+=2) {
                if (primeCandidate % index == 0) {
                    otherMultiplesFound = true;
                    break;
                }                    
            }
            
            return otherMultiplesFound ? "Not prime" : "Prime";            
            
        } else {
            
            return "Not prime";
        }
    }
    
    public String isPrimeLinearBased() {
        boolean otherMultiplesFound = false;

        if (multipleCount > 1) {

            for (int index = 2; index <= primeCandidate; index++) {
                if (primeCandidate % index == 0) {
                    otherMultiplesFound = true;
                    break;
                }
            }
            
            return otherMultiplesFound ? "Not prime" : "Prime";
        
        } else {
         
            return "Not prime";
        }
    }
}