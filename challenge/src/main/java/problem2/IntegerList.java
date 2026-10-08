package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int lastIndex=0;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    //adding the increaseSize Method
    public void increaseSize(){
        int[] newlist = new int[2*lastIndex];
        for(int i =0;i<list.length;i++){
            newlist[i]= list[i];
        }
        list = newlist;
    }
    public void addElement(int newVal){
        if((list.length-1)==lastIndex){
            this.increaseSize();
        }
        list[lastIndex]=newVal;
        lastIndex++;
    }
    public void removeFirst(int newVal){
        int indexFirstOcc=0;
        for(int i = 0;i<lastIndex;i++){
            if(list[i]==newVal){
                indexFirstOcc = i;
                break;
            }
        }
        for(int j = indexFirstOcc;j<lastIndex;j++){
            list[j]=list[j+1];
        }
        lastIndex--;
    }
    public void removeAll(int newVal){
        int j = 0;
        while (j <= lastIndex) {
            if (list[j] == newVal) {
                for (int k =j;k<lastIndex;k++) {
                    list[k]=list[k+1];
                }
                lastIndex--;
            } else {
                j++;
            }
        }

    }

}