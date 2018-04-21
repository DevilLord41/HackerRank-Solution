import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
 
public class 2DArrayDS {
    
	/*
	 * https://www.hackerrank.com/challenges/2d-array/problem 
	 */
	
    public static void main(String[] args) throws IOException {
        Reader sc = new Reader();
        int[][] arr = new int[6][6];
        for(int i = 0; i < 6;i++) {
        	for(int j = 0; j < 6;j++) {
        		arr[i][j] = sc.nextInt();
        	}
        }
        ArrayList<Integer> max = new ArrayList<Integer>();
        for(int n = 0; n < 6-2;n++) {
        	for(int m = 0; m < 6-2;m++) {
        		int[][] sub = new int[3][3];
        		int idx1=0,idx2=0;
        		for(int i = n;i<n+3;i++) {
        			for(int j = m; j < m+3;j++) {
        				sub[idx1][idx2++] = arr[i][j];
        				if(idx2==3) {
        					idx1++;
        					idx2=0;
        				}
        			}
        		}
        		int sum = 0;
        		for(int i = 0; i < 3;i++) {
        			for(int j = 0; j < 3;j++) {
        				if(i!=1) sum+=sub[i][j];
        				if(i==1 && j == 1) sum+=sub[i][j];
        			}
        			
        		}
        		max.add(sum);
        	}
        }
        
        p(Collections.max(max));
        
        sc.close();
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
    final private int BUFFER_SIZE = 1 << 16;
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
        byte[] buf = new byte[64];
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
