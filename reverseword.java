package innovapath;

String str = "hello brave new world";
tStr.reverseWordByWord(str)


	public String reverseWordByWord(String str){
	        int strLeng = str.length()-1;
	        String reverse = "", temp = "";

	        for(int i = 0; i <= strLeng; i++){
	            temp += str.charAt(i);
	            if((str.charAt(i) == ' ') || (i == strLeng)){
	                for(int j = temp.length()-1; j >= 0; j--){
	                    reverse += temp.charAt(j);
	                    if((j == 0) && (i != strLeng))
	                        reverse += " ";
	                }
	                temp = "";
	            }
	        }

	        return reverse;
	    }
}

