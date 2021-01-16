-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jan 16, 2021 at 12:41 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quizhut`
--

-- --------------------------------------------------------

--
-- Table structure for table `quiz`
--

CREATE TABLE `quiz` (
  `qid` int(3) NOT NULL,
  `quiz_id` int(3) NOT NULL,
  `question` text NOT NULL,
  `ans1` varchar(255) NOT NULL,
  `ans2` varchar(255) NOT NULL,
  `ans3` varchar(255) NOT NULL,
  `ans4` varchar(255) NOT NULL,
  `correctans` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `quiz`
--

INSERT INTO `quiz` (`qid`, `quiz_id`, `question`, `ans1`, `ans2`, `ans3`, `ans4`, `correctans`) VALUES
(1, 1, 'HTML stands for?', 'Hyper Text Markup Language', 'High Text Markup Language', 'Hyper Tabular Markup Language', 'None of these', 1),
(1, 2, 'If we want define style for an unique element, then which css selector will we use ?\r\n', 'Id\r\n', 'text\r\n', 'class\r\n', 'name\r\n', 1),
(1, 3, 'The decoded instruction is stored in ______\r\n', 'IR\r\n', 'PC\r\n', 'Registers\r\n', 'MDR\r\n', 1),
(1, 4, 'In order traversal of binary search tree will produce −\r\n', 'unsorted list\r\n', 'reverse of input\r\n', 'sorted list\r\n', 'none of the above\r\n', 3),
(1, 5, 'Which of the following can be operands of arithmetic operators?\r\n', 'Numeric\r\n', 'Boolean\r\n', 'Characters\r\n', 'Both Numeric & Characters\r\n', 4),
(1, 6, 'CLR is the .NET equivalent of _________.\r\n', 'Java Virtual Machine\r\n', 'Common Language Runtime\r\n', 'Common Type System\r\n', 'Common Language Specification\r\n', 1),
(2, 1, 'which of the following tag is used to mark a begining of paragraph ?', '<TD>', '<br>', '<P>', '<TR>', 3),
(2, 2, 'If we don\'t want to allow a floating div to the left side of an element, which css property will we use ?', 'margin\r\n', 'clear\r\n', 'float\r\n', 'padding\r\n', 2),
(2, 3, 'The instruction -> Add LOCA, R0 does _______\r\n', 'Adds the value of LOCA to R0 and stores in the temp register\r\n', 'Adds the value of R0 to the address of LOCA\r\n', 'Adds the values of both LOCA and R0 and stores it in R0\r\n', 'Adds the value of LOCA with a value in accumulator and stores it in R0\r\n', 3),
(2, 4, 'Maximum number of nodes in a binary tree with height k, where root is height 0, is\r\n', '2k − 1\r\n', '2k+1 − 1\r\n', '2k-1 + 1\r\n', '2k − 1\r\n', 2),
(2, 5, 'Modulus operator, %, can be applied to which of these?\r\n', 'Integers\r\n', 'Floating – point numbers\r\n', 'Both Integers and floating – point numbers\r\n', 'None of the mentioned\r\n', 3),
(2, 6, 'The CLR is physically represented by an assembly named _______\r\n', 'mscoree.dll\r\n', 'mcoree.dll\r\n', 'msoree.dll\r\n', 'mscor.dll\r\n', 1),
(3, 1, 'From which tag descriptive list starts ?', '<LL>', '<DD>', '<DL>', '<DS>', 3),
(3, 2, 'Suppose we want to arragnge five nos. of DIVs so that DIV4 is placed above DIV1. Now, which css property will we use to control the order of stack?\r\n', 'd-index\r\n', 's-index\r\n', 'x-index\r\n', 'z-index\r\n', 4),
(3, 3, 'Which registers can interact with the secondary storage?\r\n', 'MAR\r\n', 'PC\r\n', 'IR\r\n', 'R0\r\n', 1),
(3, 4, 'Minimum number of queues required for priority queue implementation?\r\n', '5\r\n', '4\r\n', '3\r\n', '2\r\n', 4),
(3, 5, 'With x = 0, which of the following are legal lines of Java code for changing the value of x to 1?   1. x++;  2. x = x + 1;  3. x += 1; 4. x =+ 1;\r\n', '1, 2 & 3\r\n', '1 & 4\r\n', '1, 2, 3 & 4\r\n', '3 & 2\r\n', 3),
(3, 6, 'SOAP stands for __________.\r\n', 'Simple Object Access Program\r\n', 'Simple Object Access Protocol\r\n', 'Simple Object Application Protocol\r\n', 'Simple Object Account Protocol\r\n', 2),
(4, 1, 'Correct HTML tag for the largest heading is', '<head>', '<h6>', '<heading>', '<h1>', 4),
(4, 2, 'Can we align a Block element by setting the left and right margins ?\r\n', 'Yes, we can\r\n', 'Not Possible\r\n', 'Not Possible\r\n', 'With Special Conditions, we can\r\n', 2),
(4, 3, 'During the execution of a program which gets initialized first?\r\n', 'MDR\r\n', 'IR\r\n', 'PC\r\n', 'MAR\r\n', 3),
(4, 4, 'The minimum number of edges required to create a cyclid graph of n vertices is\r\n', 'n\r\n', 'n - 1\r\n', 'n + 1\r\n', '2n\r\n', 1),
(4, 5, 'Decrement operator, −−, decreases the value of variable by what number?\r\n', '1\r\n', '2\r\n', '3\r\n', '4\r\n', 4),
(4, 6, 'The ____ language allows more than one method in a single class\r\n', 'C#\r\n', 'J#\r\n', 'C++\r\n', 'C\r\n', 1),
(5, 1, 'The attribute of <form> tag', 'Method', 'Action', 'Both (a)&(b)', 'None of these', 3),
(5, 2, 'If we want to wrap a block of text around an image, which css property will we use ?\r\n', 'wrap\r\n', 'push\r\n', 'float\r\n', 'align\r\n', 3),
(5, 3, 'Which of the register/s of the processor is/are connected to Memory Bus?\r\n', 'PC\r\n', 'MAR\r\n', 'IR\r\n', 'Both PC and MAR\r\n', 2),
(5, 4, 'What about recursion is true in comparison with iteration?\r\n', 'very expensive in terms of memory.\r\n', 'low performance.\r\n', 'every recursive program can be written with iteration too.\r\n', 'all of the above are true!\r\n', 4),
(5, 5, 'Which of these statements are incorrect?\r\n', 'Assignment operators are more efficiently implemented by Java run-time system than their equivalent long forms\r\n', 'Assignment operators run faster than their equivalent long forms\r\n', 'Assignment operators can be used only with numeric and character data type\r\n', 'None of the mentioned\r\n', 4),
(5, 6, 'In C#, a subroutine is called a ________.\r\n', 'Function\r\n', 'Metadata\r\n', 'Method\r\n', 'Managed code\r\n', 3),
(6, 1, 'Markup tags tell the web browser\r\n', 'How to organise the page\r\n', 'How to display the page\r\n', 'How to display message box on page\r\n', 'None of these\r\n', 2),
(6, 2, 'Can we define the text direction via css property ?\r\n', 'Yes, we can\r\n', 'No, we can\'t', 'Sometimes we can\r\n', 'With Special Conditions, we can\r\n', 1),
(6, 3, 'ISP stands for _________\r\n', 'Instruction Set Processor\r\n', 'Information Standard Processing\r\n', 'Interchange Standard Protocol\r\n', 'Interrupt Service Procedure\r\n', 1),
(6, 4, 'Time required to merge two sorted lists of size m and n, is\r\n', 'Ο(m | n)\r\n', 'Ο(m + n)\r\n', 'Ο(m log n)\r\n', 'Ο(n log m)\r\n', 2),
(6, 5, 'For the following question, how will the array elements look like after second pass? 34, 8, 64, 51, 32, 21\r\n', '8, 21, 32, 34, 51, 64\r\n', '8, 32, 34, 51, 64, 21\r\n', '8, 34, 51, 64, 32, 21\r\n', '8, 34, 64, 51, 32, 21\r\n', 4),
(6, 6, 'All C# applications begin execution by calling the _____ method.\r\n', 'Class()\r\n', 'Main()\r\n', 'Submain()\r\n', 'Namespace\r\n', 2),
(7, 1, 'www is based on which model?\r\n', 'Local-server\r\n', 'Client-server\r\n', '3-tier\r\n', 'None of these\r\n', 2),
(7, 2, 'Is it possible to declare font-weight, font-face & font-size by using ONLY ONE css propery ?\r\n', 'Yes, it\'s possible', 'No, not possible\r\n', 'Sometimes we can\r\n', 'With Special Conditions, we can\r\n', 1),
(7, 3, 'The internal components of the processor are connected by _______\r\n', 'Processor intra-connectivity circuitry\r\n', 'Processor bus\r\n', 'Memory bus\r\n', 'Rambus\r\n', 2),
(7, 4, 'If queue is implemented using arrays, what would be the worst run time complexity of queue and dequeue operations?\r\n', 'Ο(n), Ο(n)\r\n', 'Ο(n), Ο(1)\r\n', 'Ο(1), Ο(n)\r\n', 'Ο(1), Ο(1)\r\n', 4),
(7, 5, 'Which of the following real time examples is based on insertion sort?\r\n', 'arranging a pack of playing cards\r\n', 'database scenarios and distributes scenarios\r\n', 'arranging books on a library shelf\r\n', 'real-time systems\r\n', 1),
(7, 6, 'A _______ is an identifier that denotes a storage location\r\n', 'Constant\r\n', 'Reference type\r\n', 'Variable\r\n', 'Object\r\n', 3),
(8, 1, 'What are Empty elements and is it valid?\r\n', 'No, there is no such terms as Empty Element\r\n', 'Empty elements are element with no data\r\n', 'No, it is not valid to use Empty Element\r\n', 'None of these\r\n', 2),
(8, 2, 'If we want to show an Arrow as cursor, then which value we will use ?\r\n', 'pointer\r\n', 'default\r\n', 'arrow\r\n', 'arr\r\n', 2),
(8, 3, '______ is used to choose between incrementing the PC or performing ALU operations.\r\n', 'Conditional codes\r\n', 'Multiplexer\r\n', 'Control unit\r\n', 'None of the mentioned\r\n', 2),
(8, 4, 'Which of the following algorithm cannot be desiged without recursion −\r\n', 'Tower of Hanoi\r\n', 'Fibonacci Series\r\n', 'Tree Traversal\r\n', 'None of the above\r\n', 4),
(8, 5, 'In C, what are the basic loops required to perform an insertion sort?\r\n', 'do- while\r\n', 'if else\r\n', 'for and while\r\n', 'for and if\r\n', 3),
(8, 6, '_________ are reserved, and cannot be used as identifiers.\r\n', 'Keywords\r\n', 'literal\r\n', 'variables\r\n', 'Identifiers\r\n', 1),
(9, 1, 'Which of the following attributes of text box control allow to limit the maximum character?\r\n', 'size\r\n', 'len\r\n', 'maxlength\r\n', 'all of these\r\n', 3),
(9, 2, 'If we want to use a nice looking green dotted border around an image, which css property will we use?\r\n', 'border-color\r\n', 'border-decoration\r\n', 'border-style\r\n', 'border-line\r\n', 3),
(9, 3, 'The registers, ALU and the interconnection between them are collectively called as _____\r\n', 'process route\r\n', 'information trail\r\n', 'information path\r\n', 'data path\r\n', 4),
(9, 4, 'If locality is a concern, you can use _______ to traverse the graph.\r\n', 'Breadth First Search\r\n', 'Depth First Search\r\n', 'Either BFS or DFS\r\n', 'None of the above!\r\n', 2),
(9, 5, 'Which of the following options contain the correct feature of an insertion sort algorithm?\r\n', 'anti-adaptive\r\n', 'dependable\r\n', 'stable, not in-place\r\n', 'stable, adaptive\r\n', 4),
(9, 6, 'Boxing converts a value type on the stack to an ______ on the heap.\r\n', 'Bool type\r\n', 'Instance type\r\n', 'Class type\r\n', 'Object type\r\n', 4),
(10, 1, 'Web pages starts with which ofthe following tag?\r\n', '\"<Body>\"', '\"<Title>\"\r\n', '\"<HTML>\"\r\n', '\"<Form>\"\r\n', 3),
(10, 2, 'Which of the following properties will we use to display border around a cell without any content ?\r\n', 'empty-cell\r\n', 'blank-cell\r\n', 'noncontent-cell\r\n', 'void-cell\r\n', 1),
(10, 3, '_______ is used to store data in registers.\r\n', 'D flip flop\r\n', 'JK flip flop\r\n', 'RS flip flop\r\n', 'None of the mentioned\r\n', 1),
(10, 4, 'In conversion from prefix to postfix using stack data-structure, if operators and operands are pushed and popped exactly once, then the run-time complexity is −\r\n', 'Ο(1)\r\n', 'Ο(n)\r\n', 'Ο(log n)\r\n', 'Ο(n2)\r\n', 2),
(10, 5, 'An insertion sort is stable, adaptive, in-place and incremental in nature.11.Which of the following sorting algorithms is the fastest for sorting small arrays?\r\n', 'Quick sort\r\n', 'Insertion sort\r\n', 'Shell sort\r\n', 'Heap sort\r\n', 2),
(10, 6, 'The character pair ?: is a________________available in C#.\r\n', 'Unary operator\r\n', 'Ternary operator\r\n', 'Decision operator\r\n', 'Functional operator\r\n', 2),
(11, 1, 'HTML is a subset of\r\n', 'SGMT\r\n', 'SGML\r\n', 'SGMD\r\n', 'None of these\r\n', 2),
(11, 2, 'What should be the table width, so that the width of a table adjust to the current width of the browser window?\r\n', '640 pixels\r\n', '100%\r\n', 'full-screen\r\n', '1024 px\r\n', 2),
(11, 3, 'The main virtue for using single Bus structure is ____________\r\n', 'Fast data transfers\r\n', 'Cost effective connectivity and speed\r\n', 'Cost effective connectivity and ease of attaching peripheral devices\r\n', 'None of the mentioned\r\n', 3),
(11, 4, 'Which of the following data structure is more appropriate to represent a heap?\r\n', 'Two-dimensional array\r\n', 'Doubly linked list\r\n', 'Linear Array\r\n', 'Linked list\r\n', 3),
(11, 5, 'For the best case input, the running time of an insertion sort algorithm is?\r\n', 'Linear\r\n', 'Binary\r\n', 'Quadratic\r\n', 'Depends on the input\r\n', 1),
(11, 6, 'In C#, all binary operators are ______.\r\n', 'Center-associative\r\n', 'Right-associative\r\n', 'Left-associative\r\n', 'Top-associative\r\n', 3),
(12, 1, 'Which of the following is a container?\r\n', '<SELECT>\r\n', '<BODY>\r\n', '<INPUT>\r\n', 'Both (a) and (b)\r\n', 4),
(12, 2, 'Which element is used in the <HEAD> section on an HTML / XHTMLpage, if we want to use an external style sheet file to decorate the page ?\r\n', '<src>\r\n', '<link>\r\n', '<style>\r\n', '<css>\r\n', 2),
(12, 3, '______ are used to overcome the difference in data transfer speeds of various devices.\r\n', 'Speed enhancing circuitory\r\n', 'Bridge circuits\r\n', 'Multiple Buses\r\n', 'Buffer registers\r\n', 4),
(12, 4, 'Minimum number of fields in each node of a doubly linked list is ____\r\n', '2\r\n', '3\r\n', '4\r\n', 'None of the above\r\n', 2),
(12, 5, 'Which of the following examples represent the worst case input for an insertion sort?\r\n', 'array in sorted order\r\n', 'array sorted in reverse order\r\n', 'normal unsorted array\r\n', 'large array\r\n', 2),
(12, 6, 'An _______ is a symbol that tells the computer to perform certain mathematical or logical manipulations.\r\n', 'Operator\r\n', 'Expression\r\n', 'Condition\r\n', 'Logic\r\n', 1),
(13, 1, 'REL\r\n', 'REL\r\n', 'URL\r\n', 'REV\r\n', 'all of these\r\n', 1),
(13, 2, 'Which attribute can be added to many HTML / XHTML elements to identify them as a member of a specific group ?\r\n', 'Id\r\n', 'div\r\n', 'class\r\n', 'span\r\n', 3),
(13, 3, 'To extend the connectivity of the processor bus we use ________\r\n', 'PCI bus\r\n', 'SCSI bus\r\n', 'Controllers\r\n', 'Multiple bus\r\n', 1),
(13, 4, 'A graph in which all vertices have equal degree is known as ____\r\n', 'Complete graph\r\n', 'Regular graph\r\n', 'Multi graph\r\n', 'Simple graph\r\n', 1),
(13, 5, 'Which component is used to compile, debug and execute java program?\r\n', 'JVM\r\n', 'JDK\r\n', 'JIT\r\n', 'JRE\r\n', 2),
(13, 6, 'A _____ is any valid C# variable ending with a colon.\r\n', 'goto\r\n', 'Label\r\n', 'Logical\r\n', 'Bitwise\r\n', 2),
(14, 1, '<DT> tag is designed to fit a single line of our web page but <DD> tag will accept a\r\n', 'line of text\r\n', 'full paragraph\r\n', 'word\r\n', 'request\r\n', 2),
(14, 2, 'When we write <img src=\"img.png\">, what \"img.png\" inside double quote implies?\r\n', 'element\r\n', 'attribute\r\n', 'value\r\n', 'operator\r\n', 3),
(14, 3, 'IBM developed a bus standard for their line of computers ‘PC AT’ called _____\r\n', 'IB bus\r\n', 'M-bus\r\n', 'ISA\r\n', 'None of the mentioned\r\n', 3),
(14, 4, 'A vertex of in-degree zero in a directed graph is called a/an\r\n', 'Root vertex\r\n', 'Isolated vertex\r\n', 'Sink\r\n', 'Articulation point\r\n', 3),
(14, 5, 'Which component is responsible for converting bytecode into machine specific code?\r\n', 'JVM\r\n', 'JDK\r\n', 'JIT\r\n', 'JRE\r\n', 1),
(14, 6, 'C# has _______ operator, useful for making two way decisions.\r\n', 'Looping\r\n', 'Functional\r\n', 'Exponential\r\n', 'Conditional\r\n', 4),
(15, 1, 'Character encoding is\r\n', 'method used to represent numbers in a character\r\n', 'method used to represent character in a number\r\n', 'a system that consists of a code which pairs each character with a pattern,sequence of natural numbers or electrical pulse in order to transmit the data\r\n', 'none of these\r\n', 3),
(15, 2, 'How can we write comment along with CSS code ?\r\n', '/* a comment */\r\n', '// a comment //\r\n', '/ a comment /\r\n', '<\' a comment\'>', 1),
(15, 3, 'The bus used to connect the monitor to the CPU is ______\r\n', 'PCI bus\r\n', 'SCSI bus\r\n', 'Memory bus\r\n', 'Rambus\r\n', 2),
(15, 4, 'A graph is a tree if and only if graph is\r\n', 'Directed graph\r\n', 'Contains no cycles\r\n', 'Planar\r\n', 'Completely connected\r\n', 2),
(15, 5, 'JVM is responsible to converting bytecode to the machine specific code. JVM is also platform dependent and provides core java functions like garbage collection, memory management, security etc.15. Which component is responsible to run java program?\r\n', 'JVM\r\n', 'JDK\r\n', 'JIT\r\n', 'JRE\r\n', 4),
(15, 6, '________causes the loop to continue with the next iteration after skipping any statements in between.\r\n', 'Loop\r\n', 'Exit\r\n', 'Break\r\n', 'Continue\r\n', 4),
(16, 1, 'Correct HTML to left align the content inside a table cell is\r\n', '<tdleft>\r\n', '<td raligh = \"left\" >\r\n', '<td align = \"left\">\r\n', '<td leftalign>\r\n', 3),
(16, 2, 'Which css property you will use if you want to add some margin between a DIV\'s border and its inner text ?', 'spacing\r\n', 'margin\r\n', 'padding\r\n', 'inner-margin\r\n', 3),
(16, 3, 'ANSI stands for __________\r\n', 'American National Standards Institute\r\n', 'American National Standard Interface\r\n', 'American Network Standard Interfacing\r\n', 'American Network Security Interrupt\r\n', 1),
(16, 4, 'Which of the following piece of information does the data type to the compiler provide?\r\n', 'The way the data is to be interpreted\r\n', 'Range of values\r\n', 'Amount of memory a data element uses\r\n', 'All of above\r\n', 4),
(16, 5, 'JRE is the implementation of JVM, it provides platform to execute java programs.16.. Which component is responsible to optimize bytecode to machine code?\r\n', 'JVM\r\n', 'JDK\r\n', 'JIT\r\n', 'JRE\r\n', 3),
(16, 6, 'An ____ is a group of contiguous or related data items that share a common name.\r\n', 'Operator\r\n', 'Integer\r\n', 'Exponential\r\n', 'Array\r\n', 4),
(17, 1, 'The tag which allows you to rest other HTML tags within the description is\r\n', '<TH>\r\n', '<TD>\r\n', '<TR>\r\n', '<CAPTION>\r\n', 4),
(17, 2, 'Which CSS property is used to control the text size of an element ?\r\n', 'font-style\r\n', 'text-size\r\n', 'font-size\r\n', 'text-style\r\n', 3),
(17, 3, '_____ register Connected to the Processor bus is a single-way transfer capable.\r\n', 'PC\r\n', 'IR\r\n', 'Temp\r\n', 'Z\r\n', 4),
(17, 4, 'The elements of a linked list are stored\r\n', 'In a structure\r\n', 'In an array\r\n', 'Anywhere the computer has space for them\r\n', 'In contiguous memory locations\r\n', 3),
(17, 5, 'Which statement is true about java?\r\n', 'Platform independent programming language\r\n', 'Platform dependent programming language\r\n', 'Code dependent programming language\r\n', 'Sequence dependent programming language\r\n', 1),
(17, 6, 'Arrays in C# are ______ objects\r\n', 'Reference\r\n', 'Logical\r\n', 'Value\r\n', 'Arithmetic\r\n', 1),
(18, 1, '<Base> tag is designed to appear only between\r\n', '<HEAD>\r\n', '<TITLE>\r\n', '<BODY>\r\n', '<FORM>\r\n', 1),
(18, 2, 'The default value of \"position\" attribute is _________.\r\n', 'fixed\r\n', 'absolute\r\n', 'inherit\r\n', 'relative\r\n', 4),
(18, 3, 'In multiple Bus organisation, the registers are collectively placed and referred as ______\r\n', 'Set registers\r\n', 'Register file\r\n', 'Register Block\r\n', 'Map registers\r\n', 2),
(18, 4, 'A parentheses checker program would be best implemented using\r\n', 'List\r\n', 'Queue\r\n', 'Stack\r\n', 'Any of the above\r\n', 3),
(18, 5, 'Java is called ‘Platform Independent Language’ as it primarily works on the principle of ‘compile once, run everywhere’.18.. Which of the below is invalid identifier with the main method?\r\n', 'public\r\n', 'static\r\n', 'private\r\n', 'final\r\n', 3),
(18, 6, 'Multidimensional arrays are sometimes called _______ Arrays.\r\n', 'Square\r\n', 'Triangular\r\n', 'Rectangular\r\n', 'Cube\r\n', 3),
(19, 1, 'How can you open a link in a new browser window?\r\n', '< a href = \"url\" target = \"new\">\r\n', '<a href = \"url\" target= \"_blank\">\r\n', '<a href = \"url\".new>\r\n', '<a href = \"url\" target =\"open\">\r\n', 2),
(19, 2, 'How will you make all paragraph elements \'RED\' in color ?', 'p.all {color: red;}\r\n', 'p.all {color: #990000;}\r\n', 'all.p {color: #998877;}\r\n', 'p {color: red;}\r\n', 4),
(19, 3, 'The main advantage of multiple bus organisation over a single bus is _____\r\n', 'Reduction in the number of cycles for execution\r\n', 'Increase in size of the registers\r\n', 'Better Connectivity\r\n', 'None of the mentioned\r\n', 1),
(19, 4, 'To perform level-order traversal on a binary tree, which of the following data structure will be required?\r\n', 'Hash table\r\n', 'Queue\r\n', 'Binary search tree\r\n', 'Stack\r\n', 2),
(19, 5, 'What is the extension of java code files?\r\n', '.class\r\n', '.java\r\n', '.txt\r\n', '.js\r\n', 2),
(19, 6, '______ parameters are used to pass results back to the calling method.\r\n', 'Input\r\n', 'Reference\r\n', 'Value\r\n', 'Output\r\n', 4),
(20, 1, 'A much better approach to establish the base URL is to use\r\n', 'BASE element\r\n', 'HEAD element\r\n', 'both (a) and (b)\r\n', 'none of these\r\n', 1),
(20, 2, 'By default Hyperlinks are displayed with an underline. How do you remove the underline from all hyperlinks by using CSS code ?\r\n', 'a {text: no-underline;}\r\n', 'a {text-decoration:none;}\r\n', 'a {text-style: no-underline;}\r\n', 'a {text-decoration: no-underline;}\r\n', 2),
(20, 3, 'The ISA standard Buses are used to connect ___________\r\n', 'RAM and processor\r\n', 'GPU and processor\r\n', 'Harddisk and Processor\r\n', 'CD/DVD drives and Processor\r\n', 3),
(20, 4, 'Which of the following data structure is required to convert arithmetic expression in infix to its equivalent postfix notation?\r\n', 'Queue\r\n', 'Linked list\r\n', 'Binary search tree\r\n', 'None of above\r\n', 4),
(20, 5, 'What is the extension of compiled java classes?\r\n', '.class\r\n', '.java\r\n', '.txt\r\n', '.js\r\n', 1),
(20, 6, 'The formal-parameter-list is always enclosed in _______.\r\n', 'Square\r\n', 'Semicolon\r\n', 'Parenthesis\r\n', 'Colon\r\n', 3),
(21, 1, 'The tag used to create a new list item and also include a hyperlink is\r\n', '<LI>\r\n', '<DL>\r\n', '<DD>\r\n', '<UL>\r\n', 1),
(21, 2, 'What does CSS stand for?\r\n', 'Creative Style Sheets\r\n', 'Colorful Style Sheets\r\n', 'Cascading Style Sheets\r\n', 'Computer Style Sheets\r\n', 3),
(21, 3, 'During the execution of the instructions, a copy of the instructions is placed in the ______\r\n', 'Register\r\n', 'RAM\r\n', 'System heap\r\n', 'Cache\r\n', 4),
(21, 4, 'A binary tree in which all its levels except the last, have maximum numbers of nodes, and all the nodes in the last level have only one child it will be its left child. Name the tree.\r\n', 'Threaded tree\r\n', 'Complete binary tree\r\n', 'M-way search tree\r\n', 'Full binary tree\r\n', 2),
(21, 5, 'How can we identify whether a compilation unit is class or interface from a .class file?\r\n', 'Java source file header\r\n', 'Extension of compilation unit\r\n', 'We cannot differentiate between class and interface\r\n', 'The class or interface name should be postfixed with unit type\r\n', 1),
(21, 6, '_______ variables are visible only in the block they are declared.\r\n', 'System\r\n', 'Global\r\n', 'Local\r\n', 'Console\r\n', 3),
(22, 1, 'Can the element <First> be replaced with <first>\r\n', 'No, they represent different elements altogether', 'Both are same\r\n', 'First is correct only\r\n', 'first is only correct\r\n', 2),
(22, 2, 'What is the correct HTML for referring to an external style sheet?\r\n', '<stylesheet>mystyle.css</stylesheet />\r\n', '<style src=\"mystyle.css\" />\r\n', 'At the top of the document\r\n', '<stylesheet>mystyle.css</stylesheet>\r\n', 3),
(22, 3, 'Two processors A and B have clock frequencies of 700 Mhz and 900 Mhz respectively. Suppose A can execute an instruction with an average of 3 steps and B can execute with an average of 5 steps. For the execution of the same instruction which processor is faster?\r\n', 'A\r\n', 'B\r\n', 'Both take the same time\r\n', 'Insufficient information\r\n', 1),
(22, 4, 'Which of following data structure is more appropriate for implementing quick sort iteratively?\r\n', 'Deque\r\n', 'Queue\r\n', 'Stack\r\n', 'Priority queue\r\n', 3),
(22, 5, 'The Java source file contains a header that declares the type of class or interface, its visibility with respect to other classes, its name and any superclass it may extend, or interface it implements.22.What is use of interpreter?\r\n', 'They convert bytecode to machine language code\r\n', 'They read high level code and execute them\r\n', 'They are intermediated between JIT and JVM\r\n', 'It is a synonym for JIT\r\n', 2),
(22, 6, 'C# does not support _____ constructors.\r\n', 'parameterized\r\n', 'parameter-less\r\n', 'Class\r\n', 'Method\r\n', 2),
(23, 1, 'Any part of the graphic that is not included in another hot zone is considered to be part of\r\n', 'rect\r\n', 'point\r\n', 'default\r\n', 'polygon\r\n', 3),
(23, 2, 'Where in an HTML document is the correct place to refer to an external style sheet?\r\n', 'At the end of the document\r\n', 'In the <head> section\r\n', '<script>\r\n', 'In the <body> section\r\n', 2),
(23, 3, 'A processor performing fetch or decoding of different instruction during the execution of another instruction is called ______\r\n', 'Super-scaling\r\n', 'Pipe-lining\r\n', 'Parallel Computation\r\n', 'None of the mentioned\r\n', 2),
(23, 4, 'The number of edges in a complete graph of n vertices is\r\n', 'n(n+1)/2\r\n', 'n(n-1)/2\r\n', 'n2/2\r\n', 'n\r\n', 2),
(23, 5, 'Which of the following is not OOPS concept in Java?\r\n', 'Inheritance\r\n', 'Encapsulation\r\n', 'Polymorphism\r\n', 'Compilation\r\n', 4),
(23, 6, 'A structure in C# provides a unique way of packing together data of ______ types.\r\n', 'Different\r\n', 'Same\r\n', 'Invoking\r\n', 'Calling\r\n', 1),
(24, 1, 'Which of the tag is used to creates a number list?\r\n', '<LI>\r\n', '<OL>\r\n', '<LI> and <OL>\r\n', 'None of these\r\n', 3),
(24, 2, 'Which HTML tag is used to define an internal style sheet?\r\n', '<style>\r\n', '<css>\r\n', 'styles\r\n', '</script/>\r\n', 1),
(24, 3, 'For a given FINITE number of instructions to be executed, which architecture of the processor provides for a faster execution?\r\n', 'ISA\r\n', 'ANSA\r\n', 'Super-scalar\r\n', 'All of the mentioned\r\n', 3),
(24, 4, 'If two trees have same structure and but different node content, then they are called ___\r\n', 'Synonyms trees\r\n', 'Joint trees\r\n', 'Equivalent trees\r\n', 'Similar trees\r\n', 4),
(24, 5, 'Which of the following is a type of polymorphism in Java?\r\n', 'Compile time polymorphism\r\n', 'Execution time polymorphism\r\n', 'Multiple polymorphism\r\n', 'Multilevel polymorphism\r\n', 1),
(24, 6, 'Struct’s data members are ____________ by default.\r\n', 'Protected\r\n', 'Public\r\n', 'Private\r\n', 'Default\r\n', 3),
(25, 1, '<INPUT> is\r\n', 'format tag\r\n', 'empty tag\r\n', 'both (a) and (b)\r\n', 'none of these\r\n', 2),
(25, 2, 'Which HTML attribute is used to define inline styles?\r\n', 'font\r\n', 'class\r\n', 'D.style\r\n', 'style\r\n', 4),
(25, 3, 'The clock rate of the processor can be improved by _________\r\n', 'Improving the IC technology of the logic circuits\r\n', 'Reducing the amount of processing done in one step\r\n', 'By using the overclocking method\r\n', 'All of the mentioned\r\n', 4),
(25, 4, 'If two trees have same structure and node content, then they are called ____\r\n', 'Synonyms trees\r\n', 'Joint trees\r\n', 'Equivalent trees\r\n', 'Similar trees\r\n', 3),
(25, 5, 'When does method overloading is determined?\r\n', 'At run time\r\n', 'At compile time\r\n', 'At coding time\r\n', 'At execution time\r\n', 2),
(25, 6, 'A _______ creates an object by copying variables from another object.\r\n', 'Copy constructor\r\n', 'Default constructor\r\n', 'Invoking constructor\r\n', 'Calling constructor\r\n', 1),
(26, 1, 'The map definition file is generally stored in\r\n', 'CGI-BIN\r\n', 'RECYCLE-BIN\r\n', 'BIN\r\n', 'All of these\r\n', 1),
(26, 2, 'Which is the correct CSS syntax?\r\n', 'body {color: black}\r\n', '{body;color:black}\r\n', '{body:color=black(body}\r\n', 'body:color=black\r\n', 1),
(26, 3, 'An optimizing Compiler does _________\r\n', 'Better compilation of the given piece of code\r\n', 'Takes advantage of the type of processor and reduces its process time\r\n', 'Does better memory management\r\n', 'None of the mentioned\r\n', 2),
(26, 4, 'which of the following sorting algorithm is the fastest for sorting small array?\r\n', 'Recursion\r\n', 'Iteration\r\n', 'Both recursion and iteration\r\n', 'No method is suitable\r\n', 3),
(26, 5, 'When Overloading does not occur?\r\n', 'More than one method with same name but different method signature and different number or type of parameters\r\n', 'More than one method with same name, same signature but different number of signature\r\n', 'More than one method with same name, same signature, same number of parameters but different type\r\n', 'More than one method with same name, same number of parameters and type but different signature\r\n', 4),
(26, 6, 'The methods that have the same name, but different parameter lists and different definitions is called______.\r\n', 'Method Overloading\r\n', 'Method Overriding\r\n', 'Method Overwriting\r\n', 'Method Overreading\r\n', 1),
(27, 1, 'The latest HTML standard is\r\n', 'XML\r\n', 'SGML\r\n', 'HTML 4.0\r\n', 'HTML 5.0\r\n', 4),
(27, 2, 'How do you insert a comment in a CSS file?\r\n', '// this is a comment //\r\n', '/* this is a comment */\r\n', '\' this is a comment', '// this is a comment\r\n', 2),
(27, 3, 'The ultimate goal of a compiler is to ________\r\n', 'Reduce the clock cycles for a programming task\r\n', 'Reduce the size of the object code\r\n', 'Be versatile\r\n', 'Be able to detect even the smallest of errors\r\n', 1),
(27, 4, 'How many passes does an insertion sort algorithm consist of?\r\n', 'N\r\n', 'N-1\r\n', 'N+1\r\n', 'N2\r\n', 2),
(27, 5, 'Which concept of Java is a way of converting real world objects in terms of class?\r\n', 'Polymorphism\r\n', 'Encapsulation\r\n', 'Abstraction\r\n', 'Inheritance\r\n', 3),
(27, 6, 'The C# provides special methods known as _____ methods to provide access to data members.\r\n', 'Loop\r\n', 'Functions\r\n', 'Methods\r\n', 'Accessor\r\n', 4),
(28, 1, 'The tag used to create a hypertext relationship between current document and another URL is\r\n', '<ISINDEX>\r\n', '<A>\r\n', '<LINK>\r\n', 'none of these\r\n', 3),
(28, 2, 'How do you add a background color for all <h1> elements?\r\n', 'all.h1 {background-color:#FFFFFF}\r\n', 'h1.all {background-color:#FFFFFF}\r\n', 'h1 {background-color:#FFFFFF}\r\n', 'allh1 {background-color:#FFFFFF}\r\n', 3),
(28, 3, 'SPEC stands for _______\r\n', 'Standard Performance Evaluation Code\r\n', 'System Processing Enhancing Code\r\n', 'System Performance Evaluation Corporation\r\n', 'Standard Processing Enhancement Corporation\r\n', 3),
(28, 4, 'Which of the following algorithm implementations is similar to that of an insertion sort?\r\n', 'Binary heap\r\n', 'Quick sort\r\n', 'Merge sort\r\n', 'Radix sort\r\n', 1),
(28, 5, 'What is it called if an object has its own lifecycle and there is no owner?\r\n', 'Aggregation\r\n', 'Composition\r\n', 'Encapsulation\r\n', 'Association\r\n', 4),
(28, 6, 'When an instance method declaration includes the abstract modifier, the method is said to be an ______.\r\n', 'Abstract method\r\n', 'Instance method\r\n', 'Sealed method\r\n', 'Expression method\r\n', 1),
(29, 1, 'The text inside the <TEXT AREA> tag works like\r\n', '<P> formatted text\r\n', '<T> formatted text\r\n', '<PRE> formatted text\r\n', 'none of these\r\n', 3),
(29, 2, 'How do you change the text color of an element?\r\n', 'text-color=\r\n', 'fgcolor:\r\n', 'color:\r\n', 'text-color:\r\n', 3),
(29, 3, 'As of 2000, the reference system to find the performance of a system is _____\r\n', 'Ultra SPARC 10\r\n', 'SUN SPARC\r\n', 'SUN II\r\n', 'None of the mentioned\r\n', 1),
(29, 4, 'Insertion sort is similar to that of a binary heap algorithm because of the use of tempora5. What is the average number of inversions in an array of N distinct numbers?\r\n', 'N(N-1)/4\r\n', 'N(N+1)/2\r\n', 'N(N-1)/2\r\n', 'N(N-1)/3\r\n', 1),
(29, 5, 'What is it called where object has its own lifecycle and child object cannot belong to another parent object?\r\n', 'Aggregation\r\n', 'Composition\r\n', 'Encapsulation\r\n', 'Association\r\n', 1),
(29, 6, 'The theory of _____ implies that user can control the access to a class, method, or variable.\r\n', 'Data hiding\r\n', 'Encapsulation\r\n', 'Information Hiding\r\n', 'Polymorphism\r\n', 2),
(30, 1, 'What i s the correct HTML for adding a background color?', '<background>yellow<Background>', '<body color = \"yellow\">', '<body bg color = \"yellow\">', '<body bg =\"yellow\">', 3),
(30, 2, 'What is the correct CSS syntax for making all the <p> elements bold?', '<p style=\"text-size:bold\">', 'p {font-weight:bold}', 'p {text-size:bold}', '<p style=\"font-size:bold\">', 2),
(30, 3, 'When Performing a looping operation, the instruction gets stored in the ______', 'Registers', 'Cache', 'System Heap', 'System stack', 2),
(30, 4, 'For the following question, how will the array elements look like after second pass? 34, 8, 64, 51, 32, 21', '8, 21, 32, 34, 51, 64\r\n', '8, 32, , 34, 51, 64, 21', '8, 34, 51, 64, 32, 21\r\n', '8, 34, 64, 51, 32, 21\r\n', 4),
(30, 5, 'Which of these statements is incorrect?', 'By multithreading CPU idle time is minimized, and we can take maximum use of it', '\r\nBy multitasking CPU idle time is minimized, and we can take maximum use of it', 'Two thread in Java can have the same priority', 'A thread can exist only in two states, running and blocked', 4),
(30, 6, 'Inheritance is ______ in nature.', 'Commutative\r\n', 'Associative\r\n', 'Transitive\r\n', 'Iterative\r\n', 3);

-- --------------------------------------------------------

--
-- Table structure for table `quiz_name`
--

CREATE TABLE `quiz_name` (
  `quiz_id` int(3) NOT NULL,
  `name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `quiz_name`
--

INSERT INTO `quiz_name` (`quiz_id`, `name`) VALUES
(1, 'HTML'),
(2, 'CSS'),
(3, 'Computer Architecture'),
(4, 'DATA STRUCTURES & ALGORITHM'),
(5, 'JAVA'),
(6, 'C#');

-- --------------------------------------------------------

--
-- Table structure for table `result`
--

CREATE TABLE `result` (
  `uid` int(11) NOT NULL,
  `quiz_id` int(11) NOT NULL,
  `score` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `result`
--

INSERT INTO `result` (`uid`, `quiz_id`, `score`) VALUES
(1, 1, 0),
(1, 2, 0),
(1, 3, 30),
(1, 6, 0),
(3, 1, 30),
(3, 2, 30),
(3, 3, 20),
(4, 1, 20),
(4, 2, 30),
(5, 1, 0),
(6, 1, 30),
(7, 1, 60),
(8, 1, 40);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `UId` int(11) NOT NULL,
  `Name` text NOT NULL,
  `Pass` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`UId`, `Name`, `Pass`) VALUES
(1, 'Sanjana', 'ElcRcC8ckFQ='),
(3, 'Sapu', 'tot/37XmmyE='),
(4, 'Manuja', 'b1h8BBG+OhU='),
(5, 'Kasun', 'YgKozxaqlh8='),
(6, 'aKasun', 'ImkfVtkgelg='),
(7, 'chamara', 'x/h3mp5ZSXY='),
(8, 'raveesha', 'QrLi5mWQsE2JJSpQl9fUJg==');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `quiz`
--
ALTER TABLE `quiz`
  ADD PRIMARY KEY (`qid`,`quiz_id`),
  ADD KEY `quiz_id` (`quiz_id`);

--
-- Indexes for table `quiz_name`
--
ALTER TABLE `quiz_name`
  ADD PRIMARY KEY (`quiz_id`);

--
-- Indexes for table `result`
--
ALTER TABLE `result`
  ADD PRIMARY KEY (`uid`,`quiz_id`),
  ADD KEY `uid` (`uid`),
  ADD KEY `quiz_id` (`quiz_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`UId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `quiz_name`
--
ALTER TABLE `quiz_name`
  MODIFY `quiz_id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `UId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `quiz`
--
ALTER TABLE `quiz`
  ADD CONSTRAINT `quiz_ibfk_1` FOREIGN KEY (`quiz_id`) REFERENCES `quiz_name` (`quiz_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `result`
--
ALTER TABLE `result`
  ADD CONSTRAINT `result_ibfk_1` FOREIGN KEY (`uid`) REFERENCES `user` (`UId`) ON DELETE CASCADE ON UPDATE NO ACTION,
  ADD CONSTRAINT `result_ibfk_2` FOREIGN KEY (`quiz_id`) REFERENCES `quiz_name` (`quiz_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
