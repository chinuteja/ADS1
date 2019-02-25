import java.util.*;
import java.lang.*;
class Solution1{

	public static HashMap<Integer, Double> sortByValue(HashMap<Integer, Double> hm) 
    { 
        List<Map.Entry<Integer, Double> > list = 
               new LinkedList<Map.Entry<Integer, Double> >(hm.entrySet()); 
  
        Collections.sort(list, new Comparator<Map.Entry<Integer, Double> >() { 
            public int compare(Map.Entry<Integer, Double> o1,  
                               Map.Entry<Integer, Double> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
          
        HashMap<Integer, Double> temp = new LinkedHashMap<Integer, Double>(); 
        for (Map.Entry<Integer, Double> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    } 


	public static void main(String[] args) {
		HashMap<Integer, Double> result = new HashMap<Integer, Double>();

		TreeMap<Double, Integer> sfreq = new TreeMap<>();

		

		// HashMap<Double, Integer> freq = new HashMap<Double, Integer>();
		HashMap<Integer, Double> hm = new HashMap<Integer, Double>();

		

		Scanner ip = new Scanner(System.in);
		int ips = Integer.parseInt(ip.nextLine());
		Integer k = 0;
		Double v = 0.0;
		for (int i=0; i<ips ;i++) {
			String[] str = ip.nextLine().split(","); 			
			k = Integer.parseInt(str[0]);
			v = Double.parseDouble(str[1]);
			hm.put(k,v);
		}
		// System.out.println(hm);
		
		for (Map.Entry<Integer, Double> en : hm.entrySet()) {
			Double ke = en.getValue();
			if(sfreq.containsKey(ke))
			{
				sfreq.put(ke,sfreq.get(ke)+1);
			}
			else
			{
				sfreq.put(ke,1);
			}
		}
		// System.out.println("freq = "+freq);
		// sfreq.putAll(freq);
		// System.out.println("sfreq = "+sfreq);

		int sum = 0;
		for (Map.Entry<Double, Integer> en : sfreq.entrySet()) {

			sum+=en.getValue();
			sfreq.put(en.getKey(),sum);
		}
		// System.out.println("Usfreq = "+sfreq);
		Map<Integer, Double> hm1 = Solution1.sortByValue(hm);

		for (Map.Entry<Integer, Double> en : hm1.entrySet()) { 
			double i = en.getValue();
			// System.out.println(i);
			double id = sfreq.get(i)*100;
			double per = (double)id/ips;
			per = 100*per;
			per = Math.round(per);
			id = id/100;
			id++;
			result.put(en.getKey(),per);
			// System.out.println(" - - - "+result);

        }
        // System.out.println("res = "+result);
        int res = Integer.parseInt(ip.nextLine());
        for (int i = 0;i< res ;i++) {
        	int data = Integer.parseInt(ip.nextLine());
        	System.out.println((double)(result.get(data)/100));     	
        }

        // System.out.println(hm);
        // System.out.println(hm1);
        // System.out.println(freq);
        // System.out.println(sfreq);
        // System.out.println(result);



	}

}