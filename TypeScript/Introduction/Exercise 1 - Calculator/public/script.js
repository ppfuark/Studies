var _a;
function calcular() {
    var num1 = parseFloat(document.getElementById("num1").value);
    var num2 = parseFloat(document.getElementById("num2").value);
    var operation = document.getElementById("operation").value;
    var resultDiv = document.getElementById("result");
    if (isNaN(num1) || isNaN(num2)) {
        resultDiv.innerText = "Por favor, insira dois números válidos.";
        return;
    }
    var result;
    switch (operation) {
        case "add":
            result = num1 + num2;
            break;
        case "subtract":
            result = num1 - num2;
            break;
        case "multiply":
            result = num1 * num2;
            break;
        case "divide":
            result = num2 !== 0 ? num1 / num2 : "Não é possível dividir por zero.";
            break;
        default:
            result = "Operação inválida.";
    }
    resultDiv.innerText = "Resultado: " + result;
}
(_a = document.getElementById("calculateBtn")) === null || _a === void 0 ? void 0 : _a.addEventListener("click", calcular);
