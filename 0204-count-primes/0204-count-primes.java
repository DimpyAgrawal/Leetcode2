class Solution {
    public int countPrimes(int n) {

        if(n==0 || n==1) return count;
        primeSieve(n);
        int temp=count;
        count=0;
        return temp;
    }
    static int count=0; 
    public static int primeSieve(int n) {
			boolean[] prime= new boolean[n];
			prime[0]=prime[1]=true;
			System.out.println();
			for(int i=2;i*i<prime.length;i++) {
				if(prime[i]==false) {
					for(int k=2;k*i<prime.length;k++) {             
						prime[i*k]=true;
					}
				}
			}
			for(int i=0;i<prime.length;i++) {
				if(prime[i]==false) {
                    count++;
					//System.out.print(i+" ");
				}
			}
            return count;
		}
}