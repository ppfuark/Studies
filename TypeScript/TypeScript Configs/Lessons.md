# TypeScript Compiler Usage Guide

## 🛠️ Auto Save/Debug of a `.js` file by a `.ts`

```bash
tsc src/script.ts --watchMode
```

### or

```bash
tsc src/script.ts -w
```

### What they do?
- Compiles `script.ts` to `script.js`
- Watches the file for changes
- Automatically recompiles on every save

---

## ⚙️ Create a `tsconfig.json`

```bash
tsc --init
```

### What it does?
- Creates a `tsconfig.json` file
- Configures how TypeScript compiles your code
- Allows using just `tsc` without specifying file paths

## ⚙️ Create a `.js` script out of the `.ts` dir
```js
tsc src/script.ts --outDir public
```

## 🛠️ Don´t generate the `.js` script if the `.ts` have some error
```js
tsc src/script.ts --noEmitOnError
```