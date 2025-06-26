var _a;
function functionParameters(name) {
    var resultDiv = document.getElementById('text');
    var firstLetter = name.charAt(0).toLocaleUpperCase();
    var result = firstLetter + name.substring(1);
    if (resultDiv) {
        resultDiv.textContent = result;
    }
}
(_a = document.getElementById('button')) === null || _a === void 0 ? void 0 : _a.addEventListener("click", function () {
    var input = document.getElementById('input').value;
    functionParameters(input);
});
