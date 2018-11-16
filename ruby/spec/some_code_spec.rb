require "./lib/some_code.rb"

describe Thing do
  it "returns zero" do
    expect(Thing.new(5150).foo).to eql(5150)
  end
end