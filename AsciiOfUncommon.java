public class AsciiOfUncommon {
	public static void main(String args[]) {
		char input1[]= {'A','B','C'};
		char input2[]= {'B','C','D'};
        int num=0;
		for(int i=0;i<input1.length;i++) {
			int flag=0;
			for(int j=0;j<input2.length;) {
				if(input1[i]==input2[j]) 
                flag=1;
                break;
			}
			if(flag==0) {
                num=input1[i]-0;
                break;
            }
		}
		System.out.println("uncommon :: "+num);
		while(num>0) {
			if(num<=9) {
            System.out.println(num);
            break;
            }
			else {
				int temp=num,sum=0;
				while(temp>0) { int rem=temp%10; sum=sum+rem; temp=temp/10;}
				num=sum;
			}
		}
	}

}