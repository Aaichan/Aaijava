#include <stdio.h>

int balance = 5000;   // Global variable

void deposit(int amount) {
    balance = balance + amount;
}

void display() {
    printf("Balance: %d\n", balance);
}

int main() {
    deposit(1000);
    display();
    return 0;
}