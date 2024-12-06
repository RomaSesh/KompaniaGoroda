// Главный класс для запуска программы
public class Program {
    public static void main(String[] args) {
        // Создание массива для хранения объектов страховых компаний
        InsCompany[] cityCompanies = new InsCompany[4];

        // Создание и инициализация объектов
        cityCompanies[0] = new InsCompany("ABC", 100, 100000, 111, 111111, 1111);
        cityCompanies[1] = new InsCompany("BCD", 200, 200000, 222, 222222, 2222);
        cityCompanies[2] = new InsCompany("CDE", 300, 300000, 333, 333333, 3333);
        cityCompanies[3] = new InsCompany("DEF", 400, 400000, 444, 444444, 4444);

        // Печать информации о страховых компаниях
        for (InsCompany company : cityCompanies) {
            company.show();// Вызов метода show() для каждого объекта компании
        }

        // Выяснить, какая страховая компания имеет наименьшую сумму страховых взносов
        int min = cityCompanies[0].getSummaplus();// Начальное значение минимальной суммы взносов
        int index = 0;// Индекс компании с минимальной суммой взносов
        // Поиск компании с наименьшей суммой страховых взносов
        for (int i = 1; i < cityCompanies.length; i++) {
            int temp = cityCompanies[i].getSummaplus();
            if (temp < min) {// Если текущая сумма меньше минимальной
                min = temp;// Обновляем минимальную сумму
                index = i;// Обновляем индекс компании с минимальной суммой
            }
        }
         // Вывод названия компании с наименьшей суммой взносов
        System.out.println("\nНаименьшая сумма взносов в компании " + cityCompanies[index].getName());
    }
}