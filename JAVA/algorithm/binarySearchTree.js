// class BTSNode {
//     constructor(val){
//         this.val = val
//         this.left = null
//         this.right = null
    
//     }

// }
// class BTS {

//     constructor(){
//       this.root = null
//     }
 
//   find(value){
//       if(!this.root) return false
      
//       let current = this.root
//       let found = false
//       while(current && !found){
//             if(value < current.value){
//               current = current.left
//              } else if(value > current.value){
//                 current = current.right
//              } else {
//                   found = current
//              } 
            
//             }
    
//         if(!found) return undefined;
//         return found
      
  
//   }
// }


class BSTNode {
	constructor(val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

class BST {
	constructor() {
		/* Just like the head of a linked list, this is the start of our tree which
        branches downward from here. */
		this.root = null;
	}

	isEmpty() {
		return this.root === null;
	}

	getLargestFromSubtree(current) {
        if(current == undefined){
            current = this.root;
        }
        //if there is no forther node, return null
        if(current === null){
            return null;
        }

        //else recurse to the right and try again 
        return this.getLargestFromSubtree(current.right)
    }

	getSmallestFromSubtree() {
        var runner = this.root 
        if(!runner) return;

        while(runner.left){
            runner = runner.left;
        }
        return runner.val;
    }

	/* recursive insert

          the new Node(val) we want to insert
            |
            |     pass a changed current as we call the function again
            |       |
            v       v                       */
	insert(node, current = this.root) {
		// create defa 
        ults
		if (current === undefined) {
		    current = this.root;
		}
		// if the tree is empty?
		// check if the node VALUE is > OR < current's .val
		// if less than...
		// check current.left is null?
		// insert
		// exit / return
		// else
		// reassign current
		// RECURSE - call the function again (passing in the new current)
		// this.insert(node, new_current)
	}
}

// myBst.insert(new Node(100))

// Recursion is:
// - function that calls itself
// - and modifies the inputs
// - so that the inputs lead to a 'base case' and end the recursive call

// https://www.cs.usfca.edu/~galles/visualization/BST.html
// http://btv.melezinek.cz/binary-search-tree.html

var myBST = new BST();
console.log(myBST);
myBST.insert(new BSTNode(10));
// myBST.insert(new BSTNode(15));
// myBST.insert(new BSTNode(5));
// myBST.insert(new BSTNode(20));
// myBST.insert(new BSTNode(12));
// console.log(myBST);
/*           BST
          this.root
              |
             (10)
  node.left /   \ node.right
          (5)    (15)
         / \     /   \
              (12)   (20)
              /  \   /  \
*/

// ------------------

// function hi() {
//     console.log("hi there!");
//     hi();
//... (56 lines left)

var myBST = new BST();
myBST.insert(new BSTNode(25));
myBST.insert(new BSTNode(15));
myBST.insert(new BSTNode(50));
myBST.insert(new BSTNode(10));
myBST.insert(new BSTNode(22));
myBST.insert(new BSTNode(32));
myBST.insert(new BSTNode(41));