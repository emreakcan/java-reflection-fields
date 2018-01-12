# java-reflection-fields

    public void test(ArrayList<?> a, String id, String value) {
        if(!a.isEmpty()){
            for (int i = 0; i < a.size(); i++) {

                try {
                    Field field1 = a.get(i).getClass().getDeclaredField(value);
                    Field field2 = a.get(i).getClass().getDeclaredField(id);

                    field1.setAccessible(true);

                    Object value2 = field1.get(a.get(i));
                    Object value1 = field2.get(a.get(i));

                    System.out.println(value2.toString()  + "  " + value1.toString());

                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }
        }
    }
