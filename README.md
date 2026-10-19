# Java Academy Demos

Code from the in-class demos. New demos are added as the course goes.

## Setup (once)

1. Clone this repo:
   ```bash
   git clone <this repo's URL>
   ```
2. In IntelliJ, choose **File → Open** and select the `java-academy-demos` folder (the one containing `pom.xml`).

## Getting the latest demos (every day)

```bash
git pull
```

**Don't edit the files in this project.** If you change a file here, `git pull` can fail with a conflict. To try things out, copy the code into your own project. If you already edited something, throw away your changes first (IntelliJ: **Git → Rollback**, or `git restore .`), then pull.

## How it's organized

Demos are grouped by workbook and topic. Each file teaches **one concept**, and its name says which:

```
src/main/java/com/pluralsight/
├── workbook1c/
│   ├── formatting/    Section 3-3: StringFormatDemo, DecimalFormattingDemo
│   ├── input/         Section 3-3: ReadingInputDemo, LeftoverNewlineDemo
│   ├── conditionals/  Section 4-1: IfStatementDemo, ElseIfDemo, LogicalOperatorsDemo
│   └── methods/       Section 4-2: VoidMethodsDemo, ParametersDemo, ReturnValuesDemo
└── workbook2a/
    ├── strings/       Section 1-1: EscapingQuotesDemo, ComparingStringsDemo, ChangingStringsDemo,
    │                  CheckingStringsDemo, SearchingStringsDemo, SplitDemo
    ├── converting/    Section 1-2: ParseNumbersDemo, ParseDatesDemo
    ├── stringbuilder/ Section 1-4: StringBuilderDemo
    ├── classes/       Section 2-1: Person, CreatingObjectsDemo
    ├── objects/       Section 2-2: Person, ObjectMethodsDemo
    └── overloading/   Section 2-3: Thingy, OverloadingMethodsDemo,
                       Person, OverloadingConstructorsDemo
```

**Starter and solution have the same name:**

| Where | What it is |
|---|---|
| `methods/VoidMethodsDemo.java` | The **starter**: where the demo begins. We write the rest live in class. |
| `methods/solutions/VoidMethodsDemo.java` | The **finished** version, posted along with the starter. |

Want to practice? Redo the starter on your own (in your own project), then compare with the solution.

To run one, open the file and click the green ▶ next to `main`.
