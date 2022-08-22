package lab2;

public class Ex_2 {
	public static String sortString(char n[]) {
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				if(n[i]>n[j]) {
					char temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
		}
		for(int i=0;i<n.length/2;i++) {
			n[i]=Character.toUpperCase(n[i]);
		}
		return String.valueOf(n);
		
	}

	public static void main(String[] args) {
		String str=new String("HeLloDasH");
		char[] ch=str.toCharArray();
		String str2=sortString(ch);
		System.out.println(str2);

	}

}
