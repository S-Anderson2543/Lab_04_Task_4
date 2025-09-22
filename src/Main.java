//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int numToExamine = 2;
    int evenCheck = numToExamine % 2;
    boolean isEven;
    if (numToExamine % 2 == 0) {
        isEven = true;
    }
    else {
        isEven = false;
    }
    if (isEven == true) {
        System.out.println("Your number is even");
    }
    else {
        System.out.println("Your number is odd");
    }
}
