package coursera.union_find;

public class QuickFindUF { //Quick find is too slow
    private int[] id;
    private int count;

    public QuickFindUF(int N) {
        count = N;
        id = new int[N];
        for(int i = 0; i < N; i++){
            id[i] = i;
        }
    }

    public int count(){
        return count;
    }

    public int find(int p) {
        validate(p);
        return id[p];
    }

    private void validate(int p) {
        int n = id.length;
        if(p < 0 || p >= n){
            throw new IllegalArgumentException("index " + p + " is not valid");
        }
    }


    public boolean connected(int p, int q){
        validate(p);
        validate(q);
        return id[p] == id[q];
    }

    public void union(int p, int q){
        validate(p);
        validate(q);
        int pid = id[p];
        int qid = id[q];

        for(int i = 0; i < id.length; i++){
            if(id[i] == pid){
                id[i] = qid;
            }
            count--;
        }
    }

    void print(){
        for(int num : id){
            System.out.print(num + " ");
        }
    }
}
