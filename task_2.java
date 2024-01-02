@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("Должно вернуться true, так как пользователь совершеннолетний", true, isAdult);
}

 @Test
    public void checkIsAdultWhenAgeIsLessThan18False() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(17);
        // Проверяем, что isAdult содержит false с помощью assertEquals
        assertEquals("Должно вернуться false, так как пользователь младше 18 лет", false, isAdult);
    }

    @Test
    public void checkIsAdultWhenAgeIs18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(18);
        // Проверяем, что isAdult содержит true с помощью assertEquals
        assertEquals("Должно вернуться true, так как пользователю 18 лет", true, isAdult);
    }
