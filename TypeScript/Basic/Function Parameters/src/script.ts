function functionParameters(name: string) {
    const resultDiv = document.getElementById('text');
    let firstLetter = name.charAt(0).toLocaleUpperCase();
    let result = firstLetter + name.substring(1);

    if (resultDiv) {
        resultDiv.textContent = result;
    }
}

document.getElementById('button')?.addEventListener("click", () => {
    const input = (<HTMLInputElement>document.getElementById('input')).value;
    functionParameters(input);
});
