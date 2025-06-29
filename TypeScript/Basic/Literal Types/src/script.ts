function showInfo(text: string, value: 1 | 2 | 3){
    console.log(`Text: ${text}, Value: ${value}`);
}

showInfo("Hello", 1);
showInfo("World", 2);
showInfo("TypeScript", 4); // This will cause a TypeScript error because 4 is not a valid value