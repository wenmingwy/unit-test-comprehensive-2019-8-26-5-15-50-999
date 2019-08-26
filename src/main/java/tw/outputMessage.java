package tw;

public  class  outputMessage {
	
	String resultMessage (String input,String str) {
		if(input.equals(str)) {
			return "right";
		}
		else {
			int matching = 0;
			int matchingButPositionError = 0;
			char [] stringInput = input.toCharArray();
			char [] stringStr = str.toCharArray();
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++) {
					if(stringInput[i]==stringStr[j] && i==j) {
						matching += 1;
					}else if(stringInput[i]==stringStr[j] && i!=j) {
						matchingButPositionError += 1;
					}
				}
			}
	   return matching + "A" + matchingButPositionError + "B";
	  }
	}
}
