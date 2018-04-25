import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
 
public class FlatlandSpaceStations {
    
	/*
	 * https://www.hackerrank.com/challenges/flatland-space-stations/problem
	 */
	
    public static void main(String[] args) throws IOException {
        Reader sc = new Reader();
        int T = sc.nextInt();
        int M = sc.nextInt();
        boolean[] spaceStation = new boolean[T];
        int[] stationList = new int[M];
        for(int i = 0; i < M;i++) {
        	int space = sc.nextInt();
        	spaceStation[space] =true;
        	stationList[i] = space;
        }
        int max = 0;
        Arrays.sort(stationList);
        for(int i = 0; i < spaceStation.length;i++) {
        	if(!spaceStation[i]) {
        		max = Math.max(max,Math.abs(i-findClosest(stationList,i)));
        	}
        }
        p(max);
        
        sc.close();
    }
    
    public static int findClosest(int a[], int value)
    {
    	if(value < a[0]) {
            return a[0];
        }
        if(value > a[a.length-1]) {
            return a[a.length-1];
        }

        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            int mid = (hi + lo) / 2;

            if (value < a[mid]) {
                hi = mid - 1;
            } else if (value > a[mid]) {
                lo = mid + 1;
            } else {
                return a[mid];
            }
        }
        // lo == hi + 1
        return (a[lo] - value) < (value - a[hi]) ? a[lo] : a[hi];
    }
         
    /* -- Start PrintOut Method -- */
    static <T> void p(T o) { 
        
        try {
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            out.write(o + "");
            out.flush(); 
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    static <T> void p(T[] a) { 
        try {
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            out.write(Arrays.toString(a) + "");
            out.flush(); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   
    /* -- End PrintOut Method -- */
}

/* Fast Scanner */
class Reader {
    final private int BUFFER_SIZE = 1 << 16, BYTE_SIZE = 100001;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;

    public Reader() {
        din = new DataInputStream(System.in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    /*String reader, using s.readLine() after calling next long int or double*/
    public String readLine() throws IOException {
        byte[] buf = new byte[BYTE_SIZE];
        int cnt = 0, c;
        while ((c = read()) != -1) {
            if (c == '\n')
                break;
            buf[cnt++] = (byte) c;
        }
        return new String(buf, 0, cnt);
    }

    public int nextInt() throws IOException {
        int ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do
        {
            ret = ret * 10 + c - '0';
        }  while ((c = read()) >= '0' && c <= '9');

        if (neg)
            return -ret;
        return ret;
    }

    public long nextLong() throws IOException {
        long ret = 0;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();
        do {
            ret = ret * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');
        if (neg)
            return -ret;
        return ret;
    }

    public double nextDouble() throws IOException {
        double ret = 0, div = 1;
        byte c = read();
        while (c <= ' ')
            c = read();
        boolean neg = (c == '-');
        if (neg)
            c = read();

        do {
            ret = ret * 10 + c - '0';
        }
        while ((c = read()) >= '0' && c <= '9');

        if (c == '.')
        {
            while ((c = read()) >= '0' && c <= '9')
            {
                ret += (c - '0') / (div *= 10);
            }
        }

        if (neg)
            return -ret;
        return ret;
    }

    private void fillBuffer() throws IOException {
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if (bytesRead == -1)
            buffer[0] = -1;
    }

    private byte read() throws IOException {
        if (bufferPointer == bytesRead)
            fillBuffer();
        return buffer[bufferPointer++];
    }

    public void close() throws IOException {
        if (din == null)
            return;
        din.close();
    }
    
    public ArrayList<Integer> rALI(int n) throws IOException {
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(n-->0) res.add(nextInt());
        return res;
    }
    
    public ArrayList<String> rALS(int n) throws IOException {
        ArrayList<String> res = new ArrayList<String>();
        while(n-->0) res.add(readLine());
        return res;
    }
    
    public ArrayList<Long> rALL(int n) throws IOException {
        ArrayList<Long> res = new ArrayList<Long>();
        while(n-->0) res.add(nextLong());
        return res;
    }
    
    public ArrayList<Double> rALD(int n) throws IOException {
        ArrayList<Double> res = new ArrayList<Double>();
        while(n-->0) res.add(nextDouble());
        return res;
    }
}
