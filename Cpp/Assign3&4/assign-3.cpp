#include <iostream>
#include <stack>
#include <algorithm>
using namespace std;

bool isOperator(char c)
{
    if (c == '+' || c == '-' || c == '*' || c == '/')
        return true;
    return false;
}

int getPrecedence(char op)
{
    if (op == '+' || op == '-')
        return 1;
    else if (op == '*' || op == '/')
        return 2;
    return 0;
}

// Function to convert Infix expression to Postfix expression
string infixToPostfix(string infix)
{
    stack<char> s;
    string postfix = "";

    for (int i = 0; i < infix.length(); i++)
    {
        if (isalnum(infix[i]))
        {
            postfix += infix[i];
        }
        else if (infix[i] == '(')
        {
            s.push('(');
        }
        else if (infix[i] == ')')
        {
            while (!s.empty() && s.top() != '(')
            {
                postfix += s.top();
                s.pop();
            }
            s.pop();
        }
        else
        {
            while (!s.empty() && getPrecedence(s.top()) >= getPrecedence(infix[i]))
            {
                postfix += s.top();
                s.pop();
            }
            s.push(infix[i]);
        }
    }

    while (!s.empty())
    {
        postfix += s.top();
        s.pop();
    }

    return postfix;
}

// Function to convert Infix expression to Prefix expression
string infixToPrefix(string infix)
{
    stack<char> s;
    string prefix = "";

    // Reverse the infix expression
    reverse(infix.begin(), infix.end());

    for (int i = 0; i < infix.length(); i++)
    {
        if (infix[i] == '(')
        {
            infix[i] = ')';
        }
        else if (infix[i] == ')')
        {
            infix[i] = '(';
        }
    }

    prefix = infixToPostfix(infix);

    // Reverse the prefix expression
    reverse(prefix.begin(), prefix.end());

    return prefix;
}

int main()
{
    string infix;
    cout << "Enter an Infix expression: ";
    cin >> infix;

    string postfix = infixToPostfix(infix);
    string prefix = infixToPrefix(infix);

    cout << "Postfix expression: " << postfix << endl;
    cout << "Prefix expression: " << prefix << endl;

    return 0;
}
