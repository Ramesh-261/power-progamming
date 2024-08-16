import java.util.*;
public class tripletsequence
  {
   static int max=0;
    public static void solve(int idx,ArrayList<Integer> arr,ArrayList<Integer> tmp,int k){
          if(idx==arr.size())
          {
            max=Math.max(max,tmp.size());
            return;
         }
        if (tmp.size()==0 || (tmp.get(tmp.size()-1))*3==arr.get(idx))//2 condition for pick..                
          {
             tmp.add(arr.get(idx));
             solve(idx+1,arr,tmp,k);//again call the function..
             tmp.remove(tmp.size()-1);//last element Removee..
          }
             solve(idx+1,arr,tmp,k); //condition for notpick..
       }
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        ArrayList<Integer> tmp=new ArrayList<>();
        int idx=0;
        solve(idx,arr,tmp,k);
        System.out.println("MaxSubsSequence :"+max);
    }

  }
    
