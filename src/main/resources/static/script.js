const rowsPerPage = 10;
let currentPage = 1;

function displayRows() {
    const table = document.getElementById('votacaoTable');
    const rows = table.getElementsByTagName('tbody')[0].getElementsByTagName('tr');
    const totalRows = rows.length;
    const start = (currentPage - 1) * rowsPerPage;
    const end = start + rowsPerPage;

    for (let i = 0; i < totalRows; i++) {
        rows[i].style.display = (i >= start && i < end) ? '' : 'none';
    }

    updatePagination(totalRows);
}

function updatePagination(totalRows) {
    const pagination = document.getElementById('pagination');
    const totalPages = Math.ceil(totalRows / rowsPerPage);
    pagination.innerHTML = '';

    for (let i = 1; i <= totalPages; i++) {
        const button = document.createElement('button');
        button.textContent = i;
        button.onclick = () => {
            currentPage = i;
            displayRows();
        };
        pagination.appendChild(button);
    }
}

// Inicializa a tabela ao carregar a página
document.addEventListener('DOMContentLoaded', displayRows);
