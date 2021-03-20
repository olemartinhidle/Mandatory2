package PriorityQ;

import java.util.Objects;


//Class used by PriorityQ.PQElement program
class Element implements Comparable<Element> {
    private String name;
    private double priority;

    public Element(String name, double priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriority() {
        return priority;
    }

    public void setPriority(double priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Element element = (Element) o;
        return Double.compare(element.priority, priority) == 0 &&
                Objects.equals(name, element.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, priority);
    }

    @Override
    public String toString() {
        return  "Name='" + name + '\'' +
                ", Priority=" + priority +
                '}';
    }

    // Compare two employee objects by their salary
    @Override
    public int compareTo(Element element) {
        if(this.getPriority() > element.getPriority()) {
            return 1;
        } else if (this.getPriority() < element.getPriority()) {
            return -1;
        } else {
            return 0;
        }
    }
}
