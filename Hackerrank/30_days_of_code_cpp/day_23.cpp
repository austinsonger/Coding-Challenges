#include <iostream>
#include <queue>

using namespace std;

class Node{
    public:
        int data;
        Node *left, *right;
        Node (int d) {
            data = d;
            left = right = NULL;
        }
};

class Solution{
    public:
        Node* insert(Node* root, int data){
            if (root == NULL) {
                return new Node(data);
            } else {
                Node* current;
                if (data <= root->data){
                    current = insert(root->left, data);
                    root->left = cur;
                } else{
                    current = insert(root->right, data);
                    root->right = current;
                }
           return root;
           }
        }

        void levelOrder (Node * root) {
            queue<Node*> nodes;
            nodes.push(root);
            while (nodes.size() > 0) {
                Node * current = nodes.front();
                nodes.pop();
                cout << current->data << " ";
                if (current->left != NULL) {
                    nodes.push(current->left);
                }
                if (current->right != NULL) {
                    nodes.push(current->right);
                }
            }
            cout << endl;
        }
};

int main() {
    Solution myTree;
    Node* root = NULL;
    int T, data;
    cin >> T;
    while (T-- > 0) {
        cin >> data;
        root = myTree.insert(root, data);
    }
    myTree.levelOrder(root);
    return 0;
}
