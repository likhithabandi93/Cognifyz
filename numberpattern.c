#include <stdio.h>

int main() {
    int rows = 5; // You can change the number of rows here
    int space, i, j;
    
    for (i = 1; i <= rows; ++i) {
        // Print spaces in decreasing order
        for (space = 1; space <= rows - i; ++space) {
            printf(" ");
        }

        // Print numbers in increasing order
        for (j = 1; j <= 2 * i - 1; ++j) {
            printf("%d", j);
        }

        printf("\n");
    }
    
    return 0;
}
