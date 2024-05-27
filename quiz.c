#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

void display_question(char *question, char *options[]) {
    printf("%s\n", question);
    for (int i = 0; i < 4; i++) {
        printf("%d. %s\n", i + 1, options[i]);
    }
    printf("\n");
}

int main() {
    char *questions[] = {
        "What is the capital of Japan?",
        "Who painted the Mona Lisa?",
        "Which country is known as the Land of Kangaroos?",
        "What is the chemical symbol for gold?"
    };
    char *options[][4] = {
        {"A. Tokyo", "B. Beijing", "C. Seoul", "D. Bangkok"},
        {"A. Pablo Picasso", "B. Leonardo da Vinci", "C. Vincent van Gogh", "D. Michelangelo"},
        {"A. Canada", "B. Brazil", "C. Australia", "D. South Africa"},
        {"A. Au", "B. Ag", "C. Hg", "D. Fe"}
    };
    char answers[] = {'A', 'B', 'C', 'A'};
    int score = 0;
    char user_answer;

    for (int i = 0; i < 4; i++) {
        display_question(questions[i], options[i]);
        printf("Enter your answer (A/B/C/D): ");
        scanf(" %c", &user_answer);
        user_answer = toupper(user_answer);
        if (user_answer == answers[i]) {
            printf("Correct!\n");
            score++;
        } else {
            printf("Incorrect!\n");
        }
    }

    printf("You got %d out of %d questions correct.\n", score, 4);

    return 0;
}
