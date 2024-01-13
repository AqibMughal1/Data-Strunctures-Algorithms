#include <iostream>
using namespace std;


struct TreeNode
{
    int data;
    TreeNode *left;
    TreeNode *right;
};

class BinaryTreeType
{
public:
    TreeNode *root;
    BinaryTreeType()
    {
        root = nullptr;
    }

    int singleParent()
    {
        return singleParentCount(root);
    }

    int leavesCount()
    {
        return leavesCount(root);
    }

    int evenNumbers()
    {
        return evenNumbersCount(root);
    }

private:
    int singleParentCount(TreeNode *node)
    {
        if (node == nullptr)
            return 0;

        int count = 0;

        if ((node->left == nullptr && node->right != nullptr) ||
            (node->left != nullptr && node->right == nullptr))
        {
            count++;
        }

        count += singleParentCount(node->left);
        count += singleParentCount(node->right);

        return count;
    }

    int leavesCount(TreeNode *node)
    {
        if (node == nullptr)
            return 0;

        if (node->left == nullptr && node->right == nullptr)
            return 1;

        return leavesCount(node->left) + leavesCount(node->right);
    }

    int evenNumbersCount(TreeNode *node)
    {
        if (node == nullptr)
            return 0;

        int count = 0;

        if (node->data % 2 == 0)
            count++;

        count += evenNumbersCount(node->left);
        count += evenNumbersCount(node->right);

        return count;
    }
};

int main()
{
    BinaryTreeType tree;

    // add nodes
    tree.root = new TreeNode{1, nullptr, nullptr};
    tree.root->left = new TreeNode{2, nullptr, nullptr};
    tree.root->right = new TreeNode{3, nullptr, nullptr};
    tree.root->left->left = new TreeNode{4, nullptr, nullptr};
    tree.root->left->right = new TreeNode{5, nullptr, nullptr};
    tree.root->right->left = new TreeNode{6, nullptr, nullptr};

    std::cout << "Single parent nodes: " << tree.singleParent() << std::endl;
    std::cout << "Leaves count: " << tree.leavesCount() << std::endl;
    std::cout << "Even numbers count: " << tree.evenNumbers() << std::endl;

    return 0;
}