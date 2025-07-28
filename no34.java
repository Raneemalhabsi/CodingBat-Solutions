public List<String> no34(List<String> strings) {
    strings.removeIf(s -> s.length()==4);
    strings.removeIf(s -> s.length()==3);
    return strings;
}
