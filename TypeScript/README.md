# Create .js script out of the .ts dir
```js
tsc src/script.ts --outDir public
```

# Don´t generate the .js script if the .ts have some error
```js
tsc src/script.ts --noEmitOnError
```