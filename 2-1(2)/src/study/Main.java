package study;

/**
 *
 * �{�ۑ�ł́A�t�B�[���h�ϐ��A���\�b�h�̊�{�I�Ȏg�������w��ł����܂��傤�B
 * �ۑ�͈͈͂ȉ��̂Ƃ���ł��B
 *   Main.java: ��@�����B
 * �w�肳�ꂽ�l�ƕϐ���������ċL�q���Ă��������B
 *
 */
public class Main {

    public static void main(String[] args) {

      //�@ firstName��lastName�Ƃ������O�̕ϐ����`���A
      //   firstName�ɂ͎����̖��O�AlastName�ɂ͎����̖����ŏ��������Ȃ���
       final String firstName="yasukawa";
       final String lastName="hiromi";
       
        //getName�֐��̌Ăяo���Əo��
        System.out.println(getName(firstName, lastName));
        System.out.println();

        int[] arr = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        //�B arr �z������[�v�����AisOdd�֐����g���Ĕz��̗v�f������ǂ����̔�����s���Ȃ����B
        //   �v�f����̏ꍇ�ɂ́un�͊�ł��B�v�Əo�͂���܂��B
         for(int i = 0; i<arr.length; i++){
        	 if(arr[i] % 2 != 0) {
        		 System.out.println(arr[i] + "�͊�ł��B");
        	 }
         }


    }

    //�A �֐����`���Ȃ����B
    //   �֐����FgetName
    //  �C���q�Fpublic
    //   �����ɂ͇@�Œ�`����firstName��lastName�������Ŏ󂯎��A
    //  �A�������l��Ԃ�l�Ƃ���ϐ����`���Ȃ����B
         public static String getName(String firstName,String lastName){
        	 return firstName+lastName;
         }



    //��̔�����s���B
    public static void isOdd(int num) {
      if(num % 2 != 0) {
        System.out.println(num + "�͊�ł��B");
        }
  }
}