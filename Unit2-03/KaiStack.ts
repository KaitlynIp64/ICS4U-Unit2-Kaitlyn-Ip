/**
 * This is the KaiStack class.
 *
 * author Kaitlyn Ip
 * version 1.0
 * since 2024-03-19
 */

class KaiStack {
    // array to store strings
    private strStack: string[] = []
    // constructor
    public getConstructor(): string {
        return this.constructor.name
    }

    // method to add a string to the stack
    push(input: string): void {
        this.strStack.push(input)
    }

    // method to remove a string from stack without using pop()
    pop(): string {
        if (this.strStack.length > 0) {
            const top_item = this.strStack[this.strStack.length - 1]
            this.strStack = this.strStack.slice(0, this.strStack.length - 1)
            return top_item
        } else {
            return "Stack is empty"
        }
    }

    // method to check if the stack is empty
    isEmpty(): boolean {
        if (this.strStack.length > 0) {
            return false
        } else {
            return true
        }
    }

    // method to say the size of the stack
    size(): number {
        const stackSize = this.strStack.length
        return stackSize
    }

    // method to show the stack
    show(): string {
        let values = ""
        for (let counter = 0; counter < this.strStack.length; counter++) {
                values += this.strStack[counter] + ", "
        }
        values = values.substring(0, values.length - 2)
        return values
    }
}

export default KaiStack
 
