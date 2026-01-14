#!/bin/zsh

echo "Enter folder name:"
read folderName

newFolderName="Java $folderName"

# Parent directory of this script
BASE_PATH="$(cd "$(dirname "$0")/.." && pwd)"

FULL_PATH="$BASE_PATH/$newFolderName"

mkdir -p "$FULL_PATH"
cd "$FULL_PATH" || exit

cat <<EOF > Solution.java
class Solution {
    public static void main(String[] args) {
        System.out.println("Hey! Krunal.");
        System.out.println("Let's Do Today's Leetcode. https://leetcode.com/problemset/");
    }
}
EOF

echo ""
echo "Folder created at:"
echo "$FULL_PATH"
echo "Solution.java generated."
