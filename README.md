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

Demos are grouped by workbook and section:

```
src/main/java/com/pluralsight/
└── workbook1c/
    ├── formatting/   Section 3-3: String.format and printf
    └── methods/      Section 4-2: static methods
```

File names tell you what each file is:

| Ending | What it is |
|---|---|
| `...Starter` | Where the demo **starts**. We write the rest live in class. |
| `...Before` | Code **before** we improve it (e.g. before refactoring). |
| `...Demo` / `...App` | The **finished** demo, posted after class. |

To run one, open the file and click the green ▶ next to `main`.
