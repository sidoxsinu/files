#!/bin/bash
# Script to verify all 32 programs on Linux terminal
BASE_DIR="$(cd "$(dirname "$0")" && pwd)"
echo "Testing all programs..."

for dir in "$BASE_DIR"/*/; do
    if [ -f "$dir/run.txt" ]; then
        dname=$(basename "$dir")
        echo -n "Checking $dname ... "
        cd "$dir"
        compile_cmd=$(head -n 1 run.txt)
        eval "$compile_cmd"
        if [ $? -eq 0 ]; then
            echo "OK"
        else
            echo "FAILED"
        fi
        # cleanup class files
        rm -rf *.class bank college hospital shopping company 2>/dev/null
    fi
done
echo "Verification complete!"
