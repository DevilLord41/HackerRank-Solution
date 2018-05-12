import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
 
public class DiagonalDifference {
	
	/*
	 * 
	 * https://www.hackerrank.com/challenges/diagonal-difference/problem
	 * 
	 */
	
	private static final long MODULO = (long)(10e9)+7;
    public static void main(String[] args) throws IOException {
        Reader sc = new Reader();
        int L = sc.nextInt();
        int[][] matrix = new int[L][L];
        for(int i =0; i < L;i++) {
        	for(int j = 0;j < L;j++) {
        		matrix[i][j] = sc.nextInt();
        	}
        }
        
        int diag1 = 0;
        int diag2 = 0;
        for(int i = 0; i < L;i++) {
        	diag1 += matrix[i][i]; 
        }
        for(int i = L-1;i>=0;i--) {
        	diag2+=matrix[L-i-1][i];
        }
        p(Math.abs(diag1-diag2));
        sc.close();
    }
    
    public static int solveProblem(String bin,int result, String init) {
    	if(bin.replaceAll(init,"").length() != bin.length()) {
    		result = 1 + solveProblem(bin,result,init+"1");
    	}
    	return result;
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
